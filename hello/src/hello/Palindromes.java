package hello;
import java.util.Collection;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class Palindromes {


	/**
	 * A generic method to count a specific elements in a collection
	 * @param <T> Generic type
	 * @param collection
	 * @param checker
	 * @return 
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

/**
 *  Main method
 * @param args  argument
 */
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
        System.out.println(words.toString());
        
        System.out.println("The palindromes word in this collection are: "+  palindromeCount);  // if am correct we get : 3  as output
    }
  }



interface PalindromeChecker<T> {
    boolean isPalindrome(T element);
}