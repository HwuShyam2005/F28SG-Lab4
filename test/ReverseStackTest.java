import static org.junit.Assert.*;

import org.junit.Test;


public class ReverseStackTest {

	@Test
	public void reverseStackTest() {
		Stack st = new Stack(5);
		st.push("A");
		st.push("B");
		st.push("C");
		ReverseStack.reverseStack(st);
		assertEquals("A",(String) st.pop());
		assertEquals("B",(String) st.pop());
		assertEquals("C",(String) st.pop());
	}


}
