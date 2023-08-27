/*
 * Queue implementation with a linked list.
 */
public class LQueue implements QueueADT {
	
	private class Node{
		Object element;
		Node next;
		
		public Node(Object e, Node n){
			element = e;
			next = n;
		}
		
		public Node(Object e){
			element = e;
			next = null;
		}
	}
	
	private Node head;
	private Node tail;
	private int size;
	
	public LQueue(){
		head = null;
		tail = null;	
		size = 0;
	}
	
	/*
	 * Part 3: complete the following methods
	 */
	
	// Part 3: complete	
	public boolean isEmpty(){
		return false; // dummy value
	}
	
	// Part 3: complete
	public int size(){
		return -1; // dummy value 
	}
	
	// Part 3: complete
	public void enqueue(Object o) {

	}
	
	// Part 3: complete	
	public Object dequeue() throws QueueException{
		return null; // dummy value
	}
	
	// Part 3: complete
	public Object front() throws QueueException{
		return null; // dummy value
	}
	
}
