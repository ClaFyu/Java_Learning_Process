package day_01.s_06;
// 生成随机数组并合并

import java.util.Random;

public class Array_mix {
    public static void main(String[] args) {
        Random r = new Random();
        int length_1 = r.nextInt(6) + 5;
        int length_2 = r.nextInt(6) + 5;

        int[] a = new int[length_1];
        int[] b = new int[length_2];

        for (int i = 0; i < length_1; i++)
            a[i] = r.nextInt(101);

        for (int i = 0; i < length_2; i++)
            b[i] = r.nextInt(101);

        int[] c = new int[length_1 + length_2];
        System.arraycopy(a, 0, c, 0, length_1);
        System.arraycopy(b, 0, c, length_1, length_2);

        for (int each: c)
            System.out.println(each);
    }
}
