package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/*
	Write a program that uses iterator interface
	to loop through list and perform specific actions.
	 Example remove specific words or character
 */

public class Assignment2{
	
public static void main(String args[]) {
	 // Create the list of Strings
    List<String> words = new ArrayList<>();
    words.add("Gombe");
    words.add("kano");
    words.add("Abuja");
    words.add("Sokoto");
    words.add("kaduna");
    words.add("Yobe");

    // Letter to be removed
    String letter = "k";

    System.out.println("List before removing words that contain: " + letter);
    for (String word : words) {
        System.out.print(word + ", ");
    }
    System.out.println();

    // Create an iterator for the list
    Iterator<String> iterator = words.iterator();

    // Loop through the iterator and remove words that contain the specified letter
    while (iterator.hasNext()) {
        String word = iterator.next();
        if (word.contains(letter)) {
            iterator.remove();
        }
    }

    // After performing the operation
    System.out.println("\nUpdated list after removing words that contain '" + letter + "':");
    for (String word : words) {
        System.out.print(word + ", ");
    }
}
}
