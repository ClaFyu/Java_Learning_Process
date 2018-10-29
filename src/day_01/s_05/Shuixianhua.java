package day_01.s_05;
// 水仙花数

import java.util.ArrayList;
import java.util.List;

public class Shuixianhua {
    public static void main(String[] args) {
        List<Integer> new_int = new ArrayList<Integer>();
        for (int i = 100; i < 1000; i++) {
            int i_1 = i / 100;
            int i_2 = (i - i_1 * 100) / 10;
            int i_3 = i - i_1 * 100 - i_2 * 10;


            if (i == (int)(Math.pow(i_1, 3) + Math.pow(i_2, 3) + Math.pow(i_3, 3)))
                new_int.add(i);
        }

        Integer[] a = new_int.toArray(new Integer[new_int.size()]);
        for (int i = 0; i < a.length; i++)
            System.out.println(a[i]);
    }
}
