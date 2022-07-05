package practice;
public class single {
    private listNode head;
    private static class listNode{
        private int data;
        private listNode next;
        public listNode(int data){
            this.data=data;
            this.next=null;
        }
    }
    void display(){
        
        listNode current = head;
        while(current!=null){
            System.out.print(current.data+"====>");
            current=current.next;
        }
        System.out.println("null");
    }
    void count(){
        listNode current =head;
        int count=0;
        while(current!=null){
            current=current.next;
            count++;
        }
        System.out.println(count);
    }
    void newNodeAtHead(int value){
        listNode curr =new listNode(value);
        curr.next =head;
        head = curr;
    }
    void newNodeAtEnd(int value){
        listNode curr =new listNode(value);
        listNode current = head;
        while(current.next!=null){
            current= current.next;
        }
        current.next = curr;
    }
    void newNodeAtGivenPoint(int value,int position){
        int k =position;
        listNode newNode = new listNode(value);
        if(k==1){
            newNode.next=head;
            head=newNode;
        }else{
            int count =1;
            listNode current = head;
            while(count<k-1){
                current =current.next;
                count++;
            }
            listNode prev = current.next;
            newNode.next =prev;
            current.next=newNode;

        }

    }
    public static void main(String[] args) {
        single ob =new single();
        ob.head = new listNode(11);
        listNode first =new listNode(12);
        ob.head.next= first;
        ob.display();
        ob.count();
        ob.newNodeAtHead(10);
        ob.display();
        ob.newNodeAtEnd(13);
        ob.display();
        ob.newNodeAtGivenPoint(111, 3);
        ob.display();





    }
}
