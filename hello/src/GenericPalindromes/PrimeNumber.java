/**
 * 
 */
/**
 * @author MUSA JB
 *
 */
package GenericPalindromes;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class PrimeNumber{
	
	/**
	 *  A generic mother that return a number of prime numbers from a collection
	 * @param <T>
	 * @param collection
	 * @return
	 */
	public static <T extends Number> int countPrimeElements(Collection<T> collection) {
	    int count = 0;
	    for (T element : collection) {
	        if ( isPrime(element.intValue())) {
	            count++;
	        }
	    }
	    return count;
	}

	private static boolean isPrime(int intValue) {
		// TODO Auto-generated method stub
			if( intValue < 2) {
				return false;
			}
			for (int i = 2; i <+ Math.sqrt(intValue); i++) {
				if(intValue % i == 0) {
					return false;
				}
				
			}
			
		return true;
	}
	
	
	
	
	public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        numbers.add(10);
        numbers.add(11);

        int primeCount = PrimeNumber.countPrimeElements(numbers);
        System.out.println("The prime numbers are : "+ primeCount);  // Output: 5
    }
}

