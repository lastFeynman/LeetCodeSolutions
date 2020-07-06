package easy;

public class Solution551 {

	public boolean checkRecord(String s) {
		if(s.contains("LLL"))
			return false;
		
		int countA = 0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i) == 'A')
				countA++;
			if(countA > 1)
				return false;
		}
		
        return true;
    }
	
	public static void main(String[] args) {
		Solution551 solution551 = new Solution551();
		System.out.println(solution551.checkRecord("PPALLL"));
	}

}
