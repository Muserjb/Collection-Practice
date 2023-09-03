package hello;





import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;


class Result {

    /*
     * Complete the 'stringAnagram' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. STRING_ARRAY dictionary
     *  2. STRING_ARRAY query
     */

    public static List<Integer> stringAnagram(List<String> dictionary, List<String> query) {
    // Write your code here
    	List<Integer> list = null;
    int dictLen=dictionary.size();
    int queryLen=query.size();
    int count = 0;
     query.toArray();
     dictionary.toArray();
    Collections.sort(dictionary);
    
    String[] dicArray = new String[dictionary.size()];
    dictionary.toArray(dicArray);
    
    String[] queryArray = new String[query.size()];
    query.toArray(dicArray);
    String [] arr = new String [queryArray.length];
    int fr =0;
    for (String qa : queryArray) {
    	for (int i = 0; i < dicArray.length; i++) {
    		String individual = dicArray[i]; 
    		
    		if(qa.length() == individual.length()) {
    	       
    	        char c1[] =qa.toCharArray();
    	        char c2[] = individual.toCharArray();
    	        java.util.Arrays.sort(c1);
    	        java.util.Arrays.sort(c2);
    	        qa = String.valueOf(c1);
    	        individual = String.valueOf(c2);

    	        if(qa.equalsIgnoreCase(individual))
    	        	    // Creating an array of 3 elements  
    	        fr = fr+1;
    		}
    		
    		   list.add(fr);
		}
		
	}
    
     
   
    return list;
    }
        
    
    
}


