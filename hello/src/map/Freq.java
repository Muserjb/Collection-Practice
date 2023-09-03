package map;

import java.util.*;

	/*
	 The following program generates a frequency table of the words found in its argument list.
	The frequency table maps each word to the number of times it occurs in the argument list.
	 */

public class Freq {
    public static void main(String[] args) {
    	
    	String[] argss = {"java", "Freq", "if", "it", "is", "to", "be", "it", "is", "up", "to", "me", "to", "delegate"};
    	
       // Map<String, Integer> m = new TreeMap<String, Integer>();
        Map<String, Integer> m = new LinkedHashMap<String, Integer>();
        // Initialize frequency table from command line
        for (String a : argss) {
            Integer freq = m.get(a);
            m.put(a, (freq == null) ? 1 : freq + 1);
        }

        System.out.println(m.size() + " distinct words:");
        System.out.println(m);
    }
}