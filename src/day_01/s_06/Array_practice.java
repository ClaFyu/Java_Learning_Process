package day_01.s_06;
// 二维数组及Array练习

import java.util.Arrays;

public class Array_practice {
    public static void main(String[] args) {
        int[][] a = new int[5][8];
        int row = a.length;
        int col = a[0].length;

        for (int i = 0; i < row; i++)
            for (int j = 0; j < col; j++)
                a[i][j] = (int)(Math.random() * 100);  // 赋随机值

        int[] b = new int[row * col];
        for (int i = 0; i < row; i++) {
            System.arraycopy(a[i], 0, b, i * col, col);
        }  // 完成到一维数组的复制
        Arrays.sort(b);  // 排序

        int[][] c = new int[row][col];
        for (int i = 0; i < row; i++) {
            System.arraycopy(b, i * col, c[i], 0, col);
        }  // 完成到新二维数组的复制

        for (int i = 0; i < row; i++)
            for (int j = 0; j < col; j++)
                System.out.println(c[i][j]);
    }
}
