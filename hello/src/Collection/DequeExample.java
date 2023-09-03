package Collection;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeExample {
	public static void main(String[] arg) {
		
		//creating deque 
		Deque<String> deque = new ArrayDeque<>();
		
		deque.addFirst("element 1");
		deque.addLast("element 2");
		deque.addFirst("element 3");
		deque.addLast("element 4");
		
		//print element of the Deque
		for (String element : deque) {
			System.out.println(element);

		}
		
		//remove elements from the dequeue
		String firstElement = deque.getFirst();
		String lastElement = deque.removeLast();
		
		// print 
		 System.out.println("get First Element: " + firstElement);
	      System.out.println("Last Element removed: " + lastElement);
		
		
	      for (String element : deque) {
				System.out.println(element);

			}
	}

}
