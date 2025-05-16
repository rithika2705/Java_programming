//1.a  Develop a Java program for adding elements [Apple, Banana, Orange] into an ArrayList and a LinkedList to perform the following operations with different functions directed as follows
  1. Adding elements, 2. Adding element at specific index, 3. Adding multiple elements, 4. Accessing elements,5. Updating elements, 6. Removing elements, 7. Searching elements,
8. List size, 9. Iterating over list, 10. Using Iterator, 11. Sorting, 12. Sublist, 13. Clearing the list


import java.util.*;

public class ListOperationsDemo {
    public static void main(String[] args) {
        // Initialize ArrayList and LinkedList
        List<String> arrayList = new ArrayList<>();
        List<String> linkedList = new LinkedList<>();

        // 1. Adding elements
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Orange");

        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");

        // 2. Adding element at specific index
        arrayList.add(1, "Grapes");
        linkedList.add(1, "Grapes");

        // 3. Adding multiple elements
        List<String> moreFruits = Arrays.asList("Mango", "Pineapple");
        arrayList.addAll(moreFruits);
        linkedList.addAll(moreFruits);

        // 4. Accessing elements
        System.out.println("ArrayList element at index 2: " + arrayList.get(2));
        System.out.println("LinkedList element at index 2: " + linkedList.get(2));

        // 5. Updating elements
        arrayList.set(0, "Strawberry");
        linkedList.set(0, "Strawberry");

        // 6. Removing elements
        arrayList.remove("Banana");
        linkedList.remove("Banana");

        arrayList.remove(2); // Removes element at index 2
        linkedList.remove(2);

        // 7. Searching elements
        System.out.println("ArrayList contains 'Mango': " + arrayList.contains("Mango"));
        System.out.println("LinkedList contains 'Mango': " + linkedList.contains("Mango"));

        // 8. List size
        System.out.println("ArrayList size: " + arrayList.size());
        System.out.println("LinkedList size: " + linkedList.size());

        // 9. Iterating over list
        System.out.println("Iterating over ArrayList:");
        for (String fruit : arrayList) {
            System.out.println(fruit);
        }

        System.out.println("Iterating over LinkedList:");
        for (String fruit : linkedList) {
            System.out.println(fruit);
        }

        // 10. Using Iterator
        System.out.println("Using Iterator for ArrayList:");
        Iterator<String> arrayListIterator = arrayList.iterator();
        while (arrayListIterator.hasNext()) {
            System.out.println(arrayListIterator.next());
        }

        System.out.println("Using Iterator for LinkedList:");
        Iterator<String> linkedListIterator = linkedList.iterator();
        while (linkedListIterator.hasNext()) {
            System.out.println(linkedListIterator.next());
        }

        // 11. Sorting
        Collections.sort(arrayList);
        Collections.sort(linkedList);
        System.out.println("Sorted ArrayList: " + arrayList);
        System.out.println("Sorted LinkedList: " + linkedList);

        // 12. Sublist
        List<String> arrayListSublist = arrayList.subList(1, 3);
        List<String> linkedListSublist = linkedList.subList(1, 3);
        System.out.println("ArrayList Sublist (index 1 to 2): " + arrayListSublist);
        System.out.println("LinkedList Sublist (index 1 to 2): " + linkedListSublist);

        // 13. Clearing the list
        arrayList.clear();
        linkedList.clear();
        System.out.println("ArrayList after clearing: " + arrayList);
        System.out.println("LinkedList after clearing: " + linkedList);
    }
}



