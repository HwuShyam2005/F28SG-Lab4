import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class LQueueTest {

	LQueue q;
	@Before
	public void setup()
	{
		q = new LQueue();
	}
	
	/*
	 * 2: complete the following test methods as specified. 
	 */
	
	@Test
	public void testIsEmpty() {
		// test that q.isEmpty returns true
		fail("not implemented yet");
	}
	
	@Test
	public void testIsEmptyFalse() {
		// add an element to the queue "q"
		
		// then test that q is not an empty queue.
		fail("not implemented yet");
	}

	@Test
	public void testSizeEmpty() {
		// test the size of an empty queue is 0
		fail("not implemented yet");
	}
	
	@Test
	public void testSizeNonEmpty() {
		// add an element(s) to the queue

		// then test the size of the queue
		fail("not implemented yet");
	}

	@Test
	public void testEnqueue() {
		// enqueue an element(s) to the queue
		
		// then test that the correct element is at the front
		fail("not implemented yet");
	}
	
	@Test
	public void testDequeue() {
		// enqueue multiple elements to the queue

		// then check that they a returned in the
		// correct order with q.dequeue()
		fail("not implemented yet");
	}
	
	@Test(expected = QueueException.class)  
	public void testEmptyDequeue() {  
		// try to dequeue an empty queue
	}
	
	@Test(expected = QueueException.class)  
	public void testEmptyFront() {
		// try to get the front value of an empty queue
	}
}
