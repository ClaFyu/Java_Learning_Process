package day_01.s_05;
// 多层循环嵌套

public class Xunhuan {
    public static void main(String[] args) {
        int[][] matrix = new int[2][2];
        int[] result = {8, 6, 14, 10};

        for (int i = 0; i < 14; i++)
            for (int j = 0; j < 14; j++)
                for (int k = 0; k < 14; k++)
                    for (int m = 0; m < 14; m++){
                        if ((i + j == result[0]) &&
                                (k - m == result[1]) &&
                                (i + k == result[2]) &&
                                (j + m == result[3])){
                            matrix[0][0] = i;
                            matrix[0][1] = j;
                            matrix[1][0] = k;
                            matrix[1][1] = m;
                        }
                    }

        System.out.println(matrix[1][1]);
    }
}
