package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
	Write a program that uses iterator interface
	to loop through list and perform specific actions.
	 Example remove specific words or character
*/

public class Assignment22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        // Create a list of integers
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        numbers.add(10);

        //Integer[] numberArray = numbers.toArray(new Integer[0]);
        
        // Create an iterator for the list of numbers
        Iterator<Integer> iterator = numbers.iterator();

        // Loop through the list and perform specific actions
        System.out.println("list before removing even numbers :");
        while (iterator.hasNext()) {
            Integer number = iterator.next();

            // lets print out numbers collection in one line
            System.out.print(number+", ");

            // Example: Remove even numbers
            if (number % 2 == 0) {
                iterator.remove();
            }
        }

        // Print the updated list
        System.out.println("\nUpdated list after removing even numbers :");
        for (Integer number : numbers) {
            System.out.print(number+", ");
        }


		
		
	}

}
