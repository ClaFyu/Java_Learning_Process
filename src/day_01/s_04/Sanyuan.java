package day_01.s_04;
// 三元操作符

import java.util.Scanner;

public class Sanyuan {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("今天是周几？");
        int a = s.nextInt();
        if (1 <= a && a <= 7){
            String k = a <= 5 ? "工作日": "周末";
            System.out.println("今天是" + k + "。");
        }
        else
            System.out.println("输入错误。");
    }
}
