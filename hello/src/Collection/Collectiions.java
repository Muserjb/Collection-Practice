package Collection;

import java.util.*;

public class Collectiions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		List<String> list = new ArrayList<String>();
        for (String a : args)
            list.add(a);
        Collections.shuffle(list, new Random());
        System.out.println(list);
    */
		
	
		 List<String> list = Arrays.asList(args);
	        Collections.shuffle(list);
	        System.out.println(list);
	
	}
	
	}


