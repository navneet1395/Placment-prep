import javax.naming.LimitExceededException;

public class SinglyLinkedList {
    // implimentation of singly Linked list
    // instance variable of type listnode named as head
    private listNode head;

    private static class listNode {
        private int data; // Genric Type
        private listNode next; // creting a listnode variable named as next

        public listNode(int data) { // constructor which will carry a data part
            this.data = data;
            this.next = null; // here if new node is created its next goes to null
        }
    }

    public void display() {
        listNode current = head;
        while (current != null) {
            System.out.print(current.data + "---->");
            current = current.next;
        }
        System.out.println("null");

    }

    public int count() {
        listNode current = head;
        int c = 0;
        while (current != null) {
            c++;
            current = current.next;
        }
        return c;
    }

    public void newNodeAtHead(int value) {
        listNode newNode = new listNode(value);
        newNode.next = head;
        head = newNode;
    }

    public void newNodeAtEnd(int value) {
        listNode newNode = new listNode(value);
        if (head == null) {
            head = newNode;
        }
        listNode current = head;
        while (null != current.next) {
            current = current.next;
        }
        current.next = newNode;
    }

    public void newNodeAtGivenPoint(int value, int k) {
        listNode newNode = new listNode(value);
        if (k == 1) {
            newNode.next = head;
            head = newNode;

        } else {
            int count = 1;
            listNode current = head;
            while (count < k - 1) {
                current = current.next;
                count++;
            }
            listNode prev = current.next;
            newNode.next = prev;
            current.next = newNode;
        }
    }

    void deleteAtHead() {
        if (head == null) {
            System.out.println("no point to delete ");
        } else {
            listNode temp = head;
            head = head.next;
            temp.next = null;
        }
    }

    void deleteAtEnd() {
        if (head == null || head.next == null) {
            System.out.println(head.data);
        } else {
            listNode current = head;
            listNode temp = null;
            while (current.next != null) {
                temp = current;
                current = current.next;
            }
            temp.next = null;

        }
    }

    void deleteAtGivenPoint(int position) {
        int k = position;
        if (k == 1) {
            head = head.next;
        }
        listNode current = head;
        listNode temp = null;
        int count = 1;
        while (count < k) {
            temp = current;
            current = current.next;
            count++;
        }
        temp.next = current.next;
        current = null;
    }

    int search(int value) {
        listNode current = head;
        int count = 1;

        while (current != null) {
            if (current.data == value) {
                return count;
            }
            current = current.next;
            count++;
        }
        return -1;

    }

    void reverse() {
        if (head == null) {
            head = null;
        } else {
            listNode prev = null;
            listNode temp = null;
            listNode current = head;
            while (current != null) {
                temp = current.next;
                current.next = prev;
                prev = current;
                current = temp;
            }
            head = prev;
        }
    }

    void dvmiddle() {
        listNode current = head;
        listNode stepAhead = head;
        while (stepAhead != null && stepAhead.next != null) {
            current = current.next;
            stepAhead = stepAhead.next.next;
        }
        System.out.println(current.data);
    }

    void findNth(int k) {
        /*
         * if(head==null && n<=0){
         * return -1;
         * }else{
         * Node current = head;
         * Node ref=head;
         * int count= 0;
         * while(count<n){
         * if(ref == null){
         * return -1;
         * }
         * ref = ref.next;
         * count++;
         * }
         * while(ref!=null){
         * ref=ref.next;
         * current = current.next;
         * }
         * return current.data;
         */
        listNode curent = head;
        listNode ref = head;
        int count = 0;
        while (count < k) {
            ref = ref.next;
            count++;
            // System.out.println(" /"+ref.data);
        }
        while (ref != null) {
            ref = ref.next;
            curent = curent.next;
            // System.out.println(curent.data+" /");
        }
        System.out.println("the Nth term " + curent.data);
    }

    void middle(int k) {
        int count = 1;
        listNode current = head;
        if (k % 2 == 0) {
            int n = (k / 2) + 1;
            while (count < n - 1) {
                current = current.next;
                count++;
            }
            System.out.println(current.data);
        } else {
            int n = (k + 1) / 2;
            while (count < n) {
                current = current.next;
                count++;

            }
            System.out.println(current.data);
        }

    }

    void removeNodeSorted() {
        listNode current = head;
        while (current != null && current.next != null) {
            if (current.data == current.next.data) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
    }

    void insertNodeSorted(int k) {
        listNode newNode = new listNode(k);
        listNode current = head;
        listNode temp = null;
        while (current != null && newNode.data > current.data) {

            temp = current;
            current = current.next;
        }
        newNode.next = current;
        temp.next = newNode;
    }

    void removeGivenKey(int l){
        listNode current = head;
        listNode temp= null;
        if (current!=null && current.data==l){
            head = current.next;
            return; 
        }
        while(current!=null&& current.data!=l){
            temp =current;
            current = current.next;
        }
        if(current == null){
            return;
        }
        temp.next = current.next;
    }
    boolean checkLoop(){
        listNode current = head;
        listNode step = head;
        while(step!=null && step.next!= null){
            current = current.next;
            step =  step.next.next;
            if(current == step){
                return true;
            }
        }
        return false;
    }
    void getLoopStartPoint(){
        listNode curr = head;
        listNode step = head;
        while(step!= null && step.next!=null){
            curr = curr.next;
            step =step.next.next;
            if(curr == step){
                listNode temp = head;
                while(temp != curr){
                    temp = temp.next;
                    curr =  curr.next;
                }
                System.out.println("loop Start from here :"+temp.data);
            }     
        }
    }
    void removeLoop(){
        listNode curr = head ;
        listNode step = head ;
        while(step!= null && step.next!= null){
            curr= curr.next;
            step = step.next.next;
            if(curr ==  step){
                removeLoop(curr);
                return;
            }
            
        }
    }
    private void removeLoop(listNode curr){
        listNode temp = head;
                while(temp.next!=curr.next){
                    temp = temp.next;
                    curr = curr.next;
                }
                curr.next =null;
    }

    void mergeSort(listNode a, listNode b){
        listNode temp = new listNode(0);
        listNode tail = temp;
        while(a!=null && b!=null){
            if (a.data<= b.data){
                tail.next= a;
                b = b.next;
            }else{
                tail.next =b;
                a = a.next;
            }
            tail = tail.next;
            if(a== null){
                tail.next = b;
            }else{
                tail.next= a;
            }
            
        }
    }

    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList(); // the value of head goes to null
        sll.head = new listNode(1);
        listNode second = new listNode(1);
        listNode third = new listNode(2);
        listNode fourth = new listNode(3);
        // now we connect together to form a chain
        sll.head.next = second; // 10-->1--->null
        second.next = third;// 10-->1--->11--->null
        third.next = fourth;// 10--->--->11-->8--->null

        sll.display();
        sll.count();
        sll.newNodeAtHead(0);

        sll.display();
        sll.newNodeAtEnd(3);
        sll.middle(sll.count());
        sll.display();
        sll.newNodeAtGivenPoint(3, 5);
        sll.display();
        sll.deleteAtHead();
        sll.display();
        sll.deleteAtGivenPoint(6);

        sll.display();
        System.out.println(sll.search(20));
        sll.reverse();
        sll.display();
        sll.middle(sll.count());
        sll.dvmiddle();
        sll.findNth(2);
        sll.removeNodeSorted();
        sll.display();
        sll.reverse();
        sll.insertNodeSorted(2);
        sll.display();
        sll.removeGivenKey(1);
        sll.display();

        SinglyLinkedList loop = new SinglyLinkedList();
        loop.head = new listNode(1);
        listNode first = new listNode(2);
        listNode seconds = new listNode(3);
        listNode thirds = new listNode(4);
        listNode fourths = new listNode(5);
        listNode fifth = new listNode(6);
        listNode sixth = new listNode(7);
        loop.head.next = first;
        first.next = seconds;
        seconds.next = thirds;
        thirds.next = fourths;
        fourths.next= fifth;
        fifth.next = sixth;
        sixth.next = thirds;
        
        System.out.println(loop.checkLoop());
        loop.getLoopStartPoint();
    }

}
