public class ReverseStack {


	/*
	 * 1: complete implementation
	 */
	/** Reverses the order of elements in the given stack
	 * 
	 * TODO Where N is the number of elements in the stack the complexity is:
	 *
	 * O(?)
	 * 
	 * @param st the stack to be reversed
	 */
	public static void reverseStack(Stack st){
		//CREATION OF QUEUE AND OF SAME SIZE AS ST
		Queue rev = new Queue(st.size()+1);
		int temp = st.size();
		//USAGE OF LOOP TO POP OUT STACK ELEMENTS INTO QUEUE
		for(int i=0; i<temp ;i++) {
			rev.enqueue(st.pop());
		}
		//PUSHING ALL REMOVED ELEMENTS BACK TO THE STACK AND THUS REVERSING THE STACK
		for(int i=0; i<temp ;i++) {
			st.push(rev.dequeue());
	}
	}
}