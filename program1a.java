/*1.a  Develop a Java program for adding elements [Apple, Banana, Orange] into an ArrayList and a LinkedList to perform the following operations with different functions directed as follows
  1. Adding elements, 2. Adding element at specific index, 3. Adding multiple elements, 4. Accessing elements,5. Updating elements, 6. Removing elements, 7. Searching elements,
8. List size, 9. Iterating over list, 10. Using Iterator, 11. Sorting, 12. Sublist, 13. Clearing the list*/


package array;
import java.util.*;
public class p1 {
	public static void main(String[] args) {
		    List<String> a = new ArrayList<>();
		    List<String> l = new LinkedList<>();
		        // 1. Adding elements
		    a.add("Apple");
		    a.add("Banana");
		    a.add("Orange");

		    l.add("Apple");
		    l.add("Banana");
		    l.add("Orange");

		       // 2. Adding element at specific index
		    a.add(1, "Grapes");
		    l.add(1, "Grapes");

		        // 3. Adding multiple elements
		    List<String> moreFruits = Arrays.asList("Mango", "Pineapple");
		    a.addAll(moreFruits);
		    l.addAll(moreFruits);

		        // 4. Accessing elements
		    System.out.println("ArrayList element at index 2: " + a.get(2));
		    System.out.println("LinkedList element at index 2: " + l.get(2));

		        // 5. Updating elements
		    a.set(0, "Strawberry");
		    l.set(0, "Strawberry");

		        // 6. Removing elements
		    a.remove("Banana");
		    l.remove("Banana");

		    a.remove(2); // Removes element at index 2
		    l.remove(2);

		        // 7. Searching elements
		    System.out.println("ArrayList contains 'Mango': " + a.contains("Mango"));
		    System.out.println("LinkedList contains 'Mango': " + l.contains("Mango"));

		        // 8. List size
		    System.out.println("ArrayList size: " + a.size());
		    System.out.println("LinkedList size: " + l.size());

		        // 9. Iterating over list
		    System.out.println("Iterating over ArrayList:");
		     for (String fruit : a) {
		           System.out.println(fruit);
		        }

		      System.out.println("Iterating over LinkedList:");
		        for (String fruit : l) {
		            System.out.println(fruit);
		        }

		        // 10. Using Iterator
		        System.out.println("Using Iterator for ArrayList:");
		        Iterator<String> arrayListIterator = a.iterator();
		        while (arrayListIterator.hasNext()) {
		            System.out.println(arrayListIterator.next());
		        }

		        System.out.println("Using Iterator for LinkedList:");
		        Iterator<String> linkedListIterator = l.iterator();
		        while (linkedListIterator.hasNext()) {
		            System.out.println(linkedListIterator.next());
		        }

		        // 11. Sorting
		        Collections.sort(a);
		        Collections.sort(l);
		        System.out.println("Sorted ArrayList: " + a);
		        System.out.println("Sorted LinkedList: " + l);

		        // 12. Sublist
		        List<String> arrayListSublist = a.subList(1, 3);
		        List<String> linkedListSublist = l.subList(1, 3);
		        System.out.println("ArrayList Sublist (index 1 to 2): " + arrayListSublist);
		        System.out.println("LinkedList Sublist (index 1 to 2): " + linkedListSublist);

		        // 13. Clearing the list
		        a.clear();
		        l.clear();
		        System.out.println("ArrayList after clearing: " + a);
		        System.out.println("LinkedList after clearing: " + l);
		    }
		}




