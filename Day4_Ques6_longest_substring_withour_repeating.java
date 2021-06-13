import java.util.*;
public class Day4_Ques6_longest_substring_withour_repeating {
	public int lengthOfLongestSubstring(String s) {
        
        if(s.length() == 0){
            return 0;
        }
        
        int i,currentCount=0,max=0,index,restart=0;
        HashMap<Character,Integer> hashMap = new HashMap<Character,Integer>(); 
        for(i=0;i<s.length();i++){
        	
        	// If the character is not present in the HM then put it in HP with current index and increment the counter
            if(hashMap.get(s.charAt(i)) == null){
                hashMap.put(s.charAt(i),i);
                currentCount++;
            }
            // If the character is present in HM then we have to check it's previous index
            else if(hashMap.get(s.charAt(i)) != null){
            	// If the previous index is >= restart, it means that the letter is repeating 
                if(hashMap.get(s.charAt(i))>=restart){
                    index=hashMap.get(s.charAt(i));
                    currentCount=i-index;
                    restart=index+1;
                }
                // If the letter is present in HM but is less then restart the increment the counter
                else{
                    currentCount++;
                }
             // Putting the new index of current letter
                hashMap.put(s.charAt(i),i);
            }
            max=Math.max(max,currentCount);
        }
        return max;
        
    }
}
