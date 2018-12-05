import java.util.*;
import static java.lang.System.out;

public class Stack<E> {

	private Deque<E> deque = new ArrayDeque<>();
	private int cap;
	
	
	public Stack(int cap) {
		this.cap = cap;
	}
	
/*	public boolean push(E elem) {
		if(isFull()) {
			return false;
		}
		return deque.offerLast(elem);
	}*/
}
