//done using depth first search

import java.util.*;

public class PhoneNumberCombination {
	
//	public static void main(String args[]) {
//		letterCombinations("1002002");
//	}
//	
//	public static List<String> letterCombinations(String digits) {
//	    HashMap<Integer, String> map = new HashMap<Integer, String>();
//	    map.put(2, "abc");
//	    map.put(3, "def");
//	    map.put(4, "ghi");
//	    map.put(5, "jkl");
//	    map.put(6, "mno");
//	    map.put(7, "pqrs");
//	    map.put(8, "tuv");
//	    map.put(9, "wxyz");
//	    map.put(0, "");
//	    map.put(1, "");
//	 
//	    ArrayList<String> result = new ArrayList<String>();
//	 
//	    if(digits == null || digits.length() == 0)
//	        return result;
//	 
//	    ArrayList<Character> temp = new ArrayList<Character>();
//	    getString(digits, temp, result, map);
//	 
//	    System.out.println(result);
//	    return result;
//	}
//	 
//	public static void getString(String digits, ArrayList<Character> temp, ArrayList<String> result,  HashMap<Integer, String> map){
//	    if(digits.length() == 0){
//	        char[] arr = new char[temp.size()];
//	        for(int i=0; i<temp.size(); i++){
//	            arr[i] = temp.get(i);
//	        }
//	        result.add(String.valueOf(arr));
//	        return;
//	    }
//	 
//	    Integer curr = Integer.valueOf(digits.substring(0,1));
//	    int k1=0;
//	    int k2=1;
//	    while(curr < 2) {
//	    	if(k1 >= digits.length()) {
//	    		break;
//	    	}
//	    	curr = Integer.valueOf(digits.substring(k1++,k2++));
//	    }
//	    String letters = map.get(curr);
//	    for(int i=0; i<letters.length(); i++){
//	        temp.add(letters.charAt(i));
//	        if(k1 == 0)
//	        	++k1;
//	        getString(digits.substring(k1), temp, result, map);
//	        temp.remove(temp.size()-1);
//	    }
//	}
	
	//using BFS
	public static void main(String args[]) {
		letterCombinations("234");
	}
	
	public static List<String> letterCombinations(String digits) {
	    String[] dict = new String[]{"","","abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
	    LinkedList<StringBuilder> queue = new LinkedList<>();
	 
	    for(int i=0; i<digits.length(); i++){
	        int d = digits.charAt(i) - '0';
	        String option = dict[d];
	 
	        if(i==0){
	            for(int j=0; j<option.length(); j++){
	                queue.offer(new StringBuilder().append(option.charAt(j)));
	            }
	        }else{
	            LinkedList<StringBuilder> temp = new LinkedList<>();
	            while(!queue.isEmpty()){
	                StringBuilder sb = queue.poll();
	                for(int j=0; j<option.length(); j++){
	                    temp.offer(new StringBuilder(sb).append(option.charAt(j)));
	                }
	            }
	            queue.addAll(temp);
	        }
	    }
	 
	    List<String> result = new ArrayList<>();
	    while(!queue.isEmpty()){
	        result.add(queue.poll().toString());
	    }
	    
	    System.out.println("Result: "+result);
	    return result;
	}

}

// ANOTHER WAY : https://www.geeksforgeeks.org/iterative-letter-combinations-of-a-phone-number/
