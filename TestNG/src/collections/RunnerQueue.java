package collections;

public class RunnerQueue {

	public static void main(String[] args) {

		Queue q = new Queue();
		q.enQueue(5);
		q.enQueue(2);
		q.enQueue(8);
		q.enQueue(3);
		q.enQueue(6);
		
		
		
		
		
		q.deQueue();
		q.deQueue();
		
		
		
		
		
		q.enQueue(30);
		q.enQueue(15);
		q.show();

	}

}
