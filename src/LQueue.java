public class LQueue {
	
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
	}
	
	/*
	 * Part 3: complete the following methods
	 */
	
	// Part 3: complete	
	/**
	 * Checking if queue is empty
	 * @return boolean value affter checking if stack is empty
	 */
	public boolean isEmpty(){
		return (head==tail);
	}
	
	// Part 3: complete
	/**
	 * Checking the size of queue
	 * @return size of queue
	 */
	public int size(){
		return size; 
	}
	
	// Part 3: complete
	/**
	 * Adding a new element in queue
	 * @param o
	 */
	public void enqueue(Object o){
		//CREATION OF NEW NODE
		Node newnode = new Node(o);
		//TO CHECK IF THE HEAD IS NULL AND ADDING NEW NODE
		if (head==null) {
			head=newnode;
			tail=newnode;
		}
		//IF ITS NOT EMPTY , THEN ADD A NEW NODE AT THE TAIL 
		else {
			tail.next=newnode;
			tail=newnode;
		}
		//INCREASING THE SIZE
		size++;

	}
	
	// Part 3: complete	
	/**
	 * Removing a element from queue
	 * @return element thats removed
	 * @throws QueueException
	 */
	public Object dequeue() throws QueueException{
		//HANDLES AN EXCEPTION IF THE QUEUE IS EMPTY
		if(head==null) 
			throw new QueueException("Queue is empty");
		//REMOVING THE ELEMENTS FROM THE FRONT
		else {
			Object temp=head.element;
			head=head.next;
			return temp;
		}
	}
	
	// Part 3: complete
	/**
	 * Returning the element at head
	 * @return the first element in queue
	 * @throws QueueException
	 */
	public Object front() throws QueueException{
		//HANDLES AN EXCEPTION IF THE QUEUE IS EMPTY
		if(head==null)
			throw new QueueException("Queue is empty");
		//RETURNS THE HEAD ELEMENT
		else {
			return head.element;
		}
	}
	
}