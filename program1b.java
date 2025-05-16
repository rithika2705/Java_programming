//********************** 1b programs******************************
// -------> 1) Write a java program for getting different colors through ArrayList interface and search whether the color "Red" is available or not

package array;
import java.util.*;
public class p1 {
public static void main(String[] args) {
		  ArrayList<String> c = new ArrayList<>();
		  // Add colors to the list
		  c.add("Blue");
		  c.add("Green");
		  c.add("Yellow");
		  c.add("Red");
		  c.add("Purple");
		  // Display the list of colors
		  System.out.println("Colors in the list: " + c);

		  // Check if "Red" is present in the list
		        if (c.contains("Red")) {
		            System.out.println("The color 'Red' is available in the list.");
		        } else {
		            System.out.println("The color 'Red' is not available in the list.");
		        }
		    }
		}




//------------> 2) Write a java program for getting different colors through ArrayList interface and remove the 2nd element and color "Blue" from the ArrayList

package array;
import java.util.*;
public class p1 {
public static void main(String[] args) {
	        // Create an ArrayList to store colors
	        ArrayList<String> c = new ArrayList<>();
	        // Add colors to the list
	        c.add("Red");
	        c.add("Blue");
	        c.add("Green");
	        c.add("Yellow");
	        c.add("Purple");
	        // Display the original list
	        System.out.println("Original list: " + c);
	        // Remove the second element (index 1)
	        if (c.size() > 1) {
	            String removedElement = c.remove(1);
	            System.out.println("Removed element at index 1: " + removedElement);
	        } else {
	            System.out.println("List has fewer than 2 elements; cannot remove index 1.");
	        }

	        // Remove the color "Blue" from the list
	        boolean isBlueRemoved = c.remove("Blue");
	        if (isBlueRemoved) {
	            System.out.println("Removed 'Blue' from the list.");
	        } else {
	            System.out.println("'Blue' was not found in the list.");
	        }

	        // Display the updated list
	        System.out.println("Updated list: " + c);
	    }
	}



//--------------> 3) Write a java program for getting different colors through ArrayList interface and sort them using Collections.sort( ArrayListObj)


package array;
import java.util.*;
public class p1 {
public static void main(String[] args) {
	        // Create an ArrayList to store colors
	        ArrayList<String> c = new ArrayList<>();

	        // Add colors to the list
	        c.add("Blue");
	        c.add("Green");
	        c.add("Red");
	        c.add("Yellow");
	        c.add("Purple");

	        // Display the original list
	        System.out.println("Original list: " + c);

	        // Sort the list in ascending order
	        Collections.sort(c);

	        // Display the sorted list
	        System.out.println("Sorted list: " + c);
	    }
	}
