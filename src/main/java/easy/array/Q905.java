package easy.array;

import java.util.Arrays;

/**
 * <P>
 *     给定一个非负整数数组 A，返回一个由 A 的所有偶数元素组成的数组，后面跟 A 的所有奇数元素。
 * </P>
 * @author xuhongda on 2018/11/6
 * easy
 * leetcode-xu
 */
public class Q905 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int[] m = m(arr);
        Arrays.stream(m).forEach(System.out::println);
    }

    private static int[] m(int[] arr) {
        int [] result = new int[arr.length];
        //左边开始索引
        int left = 0;
        //右边开始索引
        int right = arr.length - 1;
        for (int anArr : arr) {
            if (anArr % 2 == 0) {
                result[left] = anArr;
                left++;
            } else {
                result[right] = anArr;
                right--;
            }
        }
        return result;
    }

}
