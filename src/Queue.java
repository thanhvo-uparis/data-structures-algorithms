
public class Queue {
	int size;
	int length;
	int front, rear;
	int array[];
	
	Queue(int size) {
		front = -1;
		rear = -1;
		array = new int[size];
		length = size;
	}
	
	public boolean isFull() {
		return  (front==0) && (rear==length-1);
	}
	
	public boolean isEmpty() {
		return rear==-1;
	}
	
	public void enQueue(int x) {
		if(isFull()) {
			System.out.println("Queue is full");
		}else {
			front = 0;
			array[++rear] = x;
			System.out.println("Add a element x = " + x);
		}
	}
	
	public void display() {
		System.out.println("front: " + front);
		System.out.println("List of array: " );
		for(int i=front; i<=rear; i++) {
			System.out.println(array[i] + " ");
		}
		System.out.println("rear: " + rear);
	}
	
	public static void main(String[] args) {
		Queue q = new Queue(4);
		
		q.enQueue(10);
		q.enQueue(11);
		q.enQueue(12);
		q.enQueue(13);
		q.enQueue(14);
		q.display();
	}

}

