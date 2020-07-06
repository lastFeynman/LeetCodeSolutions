package easy;

public class Solution167 {

    public int[] twoSum(int[] numbers, int target) {
    	int i=0;
    	int j=numbers.length-1;
    	outer:for(;i<j;i++) {
    		for(;j>i;j--) {
    			if(numbers[i] + numbers[j] < target)
    				break;
    			else if(numbers[i] + numbers[j] == target)
    				break outer;
    		}
    	}
    	return new int[]{i+1,j+1};
    }
	
	public static void main(String[] args) {
		Solution167 solution167 = new Solution167();
		System.out.println(solution167.twoSum(new int[]{2,2,7,7,14,15}, 9)[0]);
	}

}
