
public class Stack {
	  public int top;
	  public int array[];
	  public int capacite;
	  
	  Stack(int size) {
		  top = -1;
		  array = new int[size];
		  capacite = size;
	  }
	  
	  
	  public boolean isFull() {
		  return top == (capacite - 1);
	  }
	  
	  public boolean isEmpty() {
		  return top == -1;
	  }
	  
	  public void push(int x) {
		  if(isFull()) {
			  System.out.println("Over Flow. Program terminated");
		  }
		  
		  array[++top] = x;
		  
	  }	
	  
	  public int pop() {
		  if(isEmpty()) {
			  System.out.println("Stack empty!");
		  }
		  
		  return array[top--];
	  }
	  
	  public void printStack() {
		  for(int i=0; i<=top; i++) {
			  System.out.println(array[i]);
		  }
	  }

	  
	  public static void main(String[] args) {
		  Stack stack = new Stack(5);
		  
		  stack.push(5);
		  stack.push(10);
		  stack.push(15);
		  stack.push(20);
		  stack.push(25);
		  
		  stack.pop();
		  stack.pop();
		  
		  stack.printStack();
	  }
}
