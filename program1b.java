// 1b programs
// 1) Write a java program for getting different colors through ArrayList interface and search whether the color "Red" is available or not

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
