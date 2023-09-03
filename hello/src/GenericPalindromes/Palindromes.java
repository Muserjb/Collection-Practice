/**
 * 
 */
package GenericPalindromes;
	
import java.util.Collection;
import java.util.Arrays;
import java.util.List;

/**
 * @author MUSA JB
 *
 */
public class Palindromes {

	/**
	 * A generic method that accept a  specific list of collections 
	 * @param <T> generic type
	 * @param collection
	 * @param checker
	 * @return  number of palindrome
	 */
        public static <T> int countPalindromeElements(Collection<T> collection, PalindromeChecker<T> checker) {
            int count = 0;
            for (T element : collection) {
                if (checker.isPalindrome(element)) {
                    count++;
                }
            }
            return count;
        }


	    public static void main(String[] args) {
	        List<String> words = Arrays.asList("level", "hello", "madam", "world", "ahahaha");

	        PalindromeChecker<String> palindromeChecker = new PalindromeChecker<String>() {
	            @Override
	            public boolean isPalindrome(String element) {
	                StringBuilder reverse = new StringBuilder(element).reverse();
	                return element.equals(reverse.toString());
	            }
	        };



	        int palindromeCount = Palindromes.countPalindromeElements(words, palindromeChecker);
	        System.out.println(palindromeCount);  // if am correct we get : 3  as output
	    }
	  }



	interface PalindromeChecker<T> {
	    boolean isPalindrome(T element);
	}