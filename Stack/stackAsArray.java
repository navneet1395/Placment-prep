package Stack;

// import java.util.Stack;

// public class stackAsArray {
//     static final int max = 100;
//     int top;
//     int a[]= new int[max];
//     boolean isEmpty(){
//         return(top<0);
//     }
//     stackAsArray(){
//         top=-1;
//     }
//     boolean push(int x){
//         if(top >=max-1){
//             System.out.println("Stack Overflow");
//         }else{
//             a[++top]=x;
//             //System.out.print(" "+x);
//             return true;
//         }
//         return false;
//     }
//     boolean pop(){
//         if(top<0){
//             System.out.println("stack underflow");
//         }else{
//             int x = a[top--];
//             return x;
//         }
//     }
//     int peek(){
//         if(top<0){
//             System.out.println("stack underflow");
            
//         }else{
//             int x = a[top];
//             return x;
//         }
//         return top;
//     }
//     void print(){
//         for(int i =0;i>-1;i--){
//             System.out.println(" "+a[i]);
//         }
//     }
//     public static void main(String[] args) {
//         stackAsArray sa = new stackAsArray();
//         sa.push(10);
//         sa.push(20);
//         sa.push(30);
//         sa.print();
//         sa.pop();
//         sa.print();
//     }
// }
/* Java program to implement basic stack
operations */
class Stack {
	static final int MAX = 1000;
	int top;
	int a[] = new int[MAX]; // Maximum size of Stack

	boolean isEmpty()
	{
		return (top < 0);
	}
	Stack()
	{
		top = -1;
	}

	boolean push(int x)
	{
		if (top >= (MAX - 1)) {
			System.out.println("Stack Overflow");
			return false;
		}
		else {
			a[++top] = x;
			System.out.println(x + " pushed into stack");
			return true;
		}
	}

	int pop()
	{
		if (top < 0) {
			System.out.println("Stack Underflow");
			return 0;
		}
		else {
			int x = a[top--];
			return x;
		}
	}

	int peek()
	{
		if (top < 0) {
			System.out.println("Stack Underflow");
			return 0;
		}
		else {
			int x = a[top];
			return x;
		}
	}
	
	void print(){
	for(int i = top;i>-1;i--){
	System.out.print(" "+ a[i]);
	}
}
}

// Driver code
class stackAsArray {
	public static void main(String args[])
	{
		Stack s = new Stack();
		s.push(10);
		s.push(20);
		s.push(30);
		System.out.println(s.pop() + " Popped from stack");
		System.out.println("Top element is :" + s.peek());
		System.out.print("Elements present in stack :");
		s.print();
	}
}
