package easy;

import java.util.HashMap;

public class Solution1 {
    // brute force
//    public int[] twoSum(int[] nums, int target) {
//        int[] result = new int[2];
//        outer: for (int i=0; i<nums.length; i++){
//            result[0] = i;
//            for (int j=i+1; j<nums.length; j++){
//                if(nums[i] + nums[j] == target){
//                    result[1] = j;
//                    break outer;
//                }
//            }
//        }
//
//
//        return result;
//    }

    // hash map
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i< nums.length; i++){
            if(map.containsKey(nums[i]) && nums[i]*2 == target){
                result[0] = map.get(nums[i]);
                result[1] = i;
                return result;
            }
            map.put(nums[i], i);
        }

        for(int i=0; i<nums.length;i++){
            map.remove(nums[i]);
            if(map.containsKey(target-nums[i])){
                result[0] = i;
                result[1] = map.get(target-nums[i]);
                break;
            }
        }

        return result;
    }

    public static void main(String[] args){
        int[] nums = {2, 7, 11, 15};
        Solution1 solution1 = new Solution1();
        int[] a = solution1.twoSum(nums, 9);
        System.out.println(a[0]+" "+a[1]);
    }
}
