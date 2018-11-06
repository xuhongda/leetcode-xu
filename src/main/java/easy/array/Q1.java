package easy.array;

import java.util.Arrays;

/**
 * @author xuhongda on 2018/11/6
 * easy
 * leetcode-xu
 */
public class Q1 {
    public static void main(String[] args) {
        int [] nums = new int[]{1,2,2,3};
        int[] ints = twoSum(nums, 4);
        Arrays.stream(ints).forEach(a-> System.out.println(a));

    }

    public static  int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == target - nums[i]) {
                    return new int[] { i, j };
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
