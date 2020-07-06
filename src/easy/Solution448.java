package easy;

import java.util.ArrayList;
import java.util.List;

public class Solution448 {
	
	public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        	list.add(i+1);
        for(int num : nums) {
        	list.set(num-1, 0);
        }
        for(int i=0;i<list.size();i++) {
        	if(list.get(i)==0) {
        		list.remove(i);
        		i--;
        	}
        }
        return list;
    }

	public static void main(String[] args) {
		Solution448 solution448 = new Solution448();
		System.out.println(solution448.findDisappearedNumbers(new int[] {1,1,2,2}));
	}

}
