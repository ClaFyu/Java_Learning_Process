package day_01.s_04;
// 计算两个整数的和

import java.util.Scanner;

public class And_End {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int result = a + b;

        System.out.println("和是：" + result);
    }
}
