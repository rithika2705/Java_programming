//**************** 1C PROGRAMS **************

/*-----------> 1a) Write a Java program to iterate through all elements in a linked list starting at the
specified position ( 2nd) using iterator ( hint : Iterator iteratorobj = listobj.listIterator(1))*/

package array;
import java.util.*;
public class p1 {
public static void main(String[] args) {
	        // Create a LinkedList to store fruit names
	        LinkedList<String> fruits = new LinkedList<>();

	        // Add fruit names to the list
	        fruits.add("Apple");
	        fruits.add("Banana");
	        fruits.add("Cherry");
	        fruits.add("Date");
	        fruits.add("Elderberry");

	        // Display the original list
	        System.out.println("Original list of fruits: " + fruits);

	        // Create a ListIterator starting at index 1 (second element)
	        ListIterator<String> iterator = fruits.listIterator(1);

	        // Iterate through the list starting from the second element
	        System.out.println("Iterating from the second fruit:");
	        while (iterator.hasNext()) {
	            System.out.println(iterator.next());
	        }
	    }
	}
