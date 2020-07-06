package easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Solution389 {
	
	public char findTheDifference(String s, String t) {
        Map<Character,Integer> sMap = new HashMap<>();
        Map<Character,Integer> tMap = new HashMap<>();
		
        for(int i=0;i<s.length();i++) {
        	if(sMap.containsKey(s.charAt(i))) {
        		sMap.put(s.charAt(i), sMap.get(s.charAt(i))+1);
        	}else {
        		sMap.put(s.charAt(i), 1);
        	}
        }
        for(int i=0;i<t.length();i++) {
        	if(tMap.containsKey(t.charAt(i))) {
        		tMap.put(t.charAt(i), tMap.get(t.charAt(i))+1);
        	}else {
        		tMap.put(t.charAt(i), 1);
        	}
        }
        
        for(Entry<Character, Integer> entry : tMap.entrySet()) {
        	if(!sMap.containsKey(entry.getKey()))
        		return entry.getKey();
        	
        	if(sMap.get(entry.getKey()) != entry.getValue())
        		return entry.getKey();
        }
        return ' ';
    }

	public static void main(String[] args) {
		Solution389 solution389 = new Solution389();
		System.out.println(solution389.findTheDifference("abccd", "abccdd"));
	}

}
