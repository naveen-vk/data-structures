import java.util.*;

// Main class
public class Palindrome {

	// Main driver method
	public static void main(String args[])
	{
		// Creating object of the
		// class linked list
		LinkedList<Integer> ll = new LinkedList<Integer>();

		// Adding elements to the linked list
		ll.add(1);
		ll.add(2);
		ll.addLast(3);
		ll.addFirst(5);
		ll.add(2, 7);

		System.out.println(ll);

		ll.remove(2);
		ll.remove(3);
		ll.removeFirst();
		ll.removeLast();

		System.out.println(ll);
	}
}
