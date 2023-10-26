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
		//TEST FOR Q.ISEMPTY FOR WHICH IT RETURNS TRUE
		assertEquals(true,q.isEmpty());
	}
	
	@Test
	public void testIsEmptyFalse() {
		//ADDITION OF ELEMENTS TO THE "Q" QUEUE
		q.enqueue(1);
		//TESTING TO DECLARE Q IS NOT AN EMPTY QUEUE
		assertEquals(1,q.size());
	}

	@Test
	public void testSizeEmpty() {
		//TESTING THE SIZE OF AN EMPTY QUEUE IS 0
		assertEquals(0,q.size());
	}
	@Test
	public void testSizeNonEmpty() {
		//ADDITION OF ELEMENTS TO THE QUEUE
		q.enqueue(5);
		q.enqueue(6);
		//TEST FOR CHECKING THE SIZE OF QUEUE
		assertEquals(2,q.size());
	}

	@Test
	public void testEnqueue() {
		//ENQUEUING THE ELEMENTS TO THE QUEUE 
		q.enqueue(5);
		q.enqueue(6);
		//AFTER THAT TEST IF THE CORRECT ELEMENTS IS AT FRONT
		assertEquals(5,q.front());
	}
	
	@Test
	public void testDequeue() {
		//ENQUEUING THE  MULTIPLE ELEMENTS INTO QUEUE
		q.enqueue(5);
		q.enqueue(6);
		//CHECKING IF THEY RETURNED IN THE CORRECT ORDER WITH RESPECT TO DEQUEUE
		assertEquals(5,q.dequeue());
		assertEquals(6,q.dequeue());
	}
	
	@Test(expected = QueueException.class)  
	public void testEmptyDequeue() {  
		//TRYING TO DEQUEUE AN EMPTY QUEUE
		q.dequeue();
	}
	
	@Test(expected = QueueException.class)  
	public void testEmptyFront() {
		//TRYING TO GET THE FRONT VALUE OF THE EMPTY QUEUE
		q.front();
	}
}