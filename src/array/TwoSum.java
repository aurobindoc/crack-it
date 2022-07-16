package array;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[]{map.get(target - nums[i]), i};
            } else {
                map.put(nums[i], i);
            }
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        int[] nums = new int[]{3,3};
        int target = 6;

        int[] res = new TwoSum().twoSum(nums, target);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + ", ");
        }
        System.out.println();
    }

}

