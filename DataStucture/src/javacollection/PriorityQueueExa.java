package javacollection;

import java.util.PriorityQueue;

public class PriorityQueueExa {

	public static void main(String []args) {
		PriorityQueue<Integer> queue=new PriorityQueue<Integer>((a,b)-> b-a);
		queue.add(10);
		queue.add(20);
		queue.add(30);
		queue.add(40);
		queue.add(40);
		queue.add(5);
		queue.add(5);
		
		//queue.remove(5);
		
		//System.out.println(queue.poll());
		//System.out.println(queue.poll());
		
		
		for (Integer integer : queue) {
			System.out.println(integer);
		}
		
		
		
	}
}
