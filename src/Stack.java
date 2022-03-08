
public class Stack {
	  public int top;
	  public int capacite;
	  public int arr[];
	  
	  public Boolean isFull() {
		  return top == capacite - 1;
	  }
	  
	  public Boolean isEmpty() {
		  return top == -1;
	  }
	  
	  Stack(int size) {
		  top = -1;
		  capacite = size;
		  arr = new int[size];
	  }
	  
	  public void push(int x) {
		  if(isFull()) {
			  System.out.println("It is full");
		  }
		  arr[++top] = x;
	  }
	  
	  
	  public void printStack() {
		  for(int i=0; i<=top; i++) {
			  System.out.println(arr[i]);
		  }
	  }
	  
	  public static void main(String[] args) {
		  Stack stack = new Stack(5);
		  
		  stack.push(10);
		  stack.push(12);
		  stack.printStack();
		 
	  }
}
