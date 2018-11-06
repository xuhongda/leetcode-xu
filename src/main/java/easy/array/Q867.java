package easy.array;

import java.util.Arrays;

/**
 * <p>
 * 给定一个矩阵 A， 返回 A 的转置矩阵。
 * 矩阵的转置是指将矩阵的主对角线翻转，交换矩阵的行索引与列索引。
 * </p>
 *
 * @author xuhongda on 2018/11/6
 * easy.array
 * leetcode-xu
 */
public class Q867 {

    public static void main(String[] args) {
        int[][] a = {{1, 2}, {3, 6}};
        int[][] m = m(a);
        Arrays.stream(m).forEach(x -> Arrays.stream(x).forEach(System.out::println));
    }

    private static int[][] m(int[][] arr) {
        int i = arr.length, k = arr[0].length;
        int[][] ans = new int[i][k];
        for (int r = 0; r < i; r++) {
            for (int c = 0; c < k; c++) {
                ans[c][r] = arr[r][c];
            }
        }
        return ans;
    }
}
