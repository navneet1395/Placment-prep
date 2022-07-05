package Stack;

public class stackAslinkedlist {
    private ListNode top;
    private int  length;
    private class ListNode{
        private int data;
        private ListNode next;
        public ListNode(int data){ // constructor 
            this.data = data ;
        } }
    public stackAslinkedlist(){ // constructor of above class 
            top  = null ;
            length =0;
    }
    public int length(){
        return length;
    }
    public boolean isEmpty(){
        // if(length ==0){
        //     return true;
        // }else{
        //     return false;
        // }
        return length==0;
    }
    public void push(int data){
        ListNode temp = new ListNode(data);
        temp.next= top;
        top = temp;
        length++; 
    }
    public int pop(){
        if(isEmpty()){
            System.out.println("underflow condition");
        }
        int result = top.data;
        top = top.next;
        length--;
        return result;
    }
    public void peek(){
        
        if(isEmpty()){
            System.out.println("underflow condition");
        }
        System.out.println(top.data);
    }
    // public void display(){
    //     ListNode current = new ListNode(data);
    //         current = top;
    //     for(int i=0;i<length;i++){
    //         System.out.print(current.data+"--->");
    //         current = current.next;
    //     }
    // }
    public static void main(String[] args) {
        stackAslinkedlist sll = new stackAslinkedlist();
        sll.push(10);
        sll.push(15);
        sll.push(20);
        sll.push(25);
        sll.peek();
        sll.pop();
        sll.peek();
        sll.pop();
        sll.peek();
        sll.pop();
        sll.peek();
        sll.pop();
        sll.peek();
        
        
    }
    
}
