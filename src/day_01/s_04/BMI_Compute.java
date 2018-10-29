package day_01.s_04;
// 算数操作符及Scanner练习

import java.util.Scanner;

public class BMI_Compute {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("请输入身高(m)：");
        double length = s.nextDouble();
        System.out.println("请输入体重(kg)：");
        int weight = s.nextInt();

        double BMI = weight / (length * length);
        System.out.println("当前的BMI是：" + BMI);

        if (BMI < 18.5)
            System.out.println("体重过轻");
        else if (BMI >= 18.5 && BMI < 24)
            System.out.println("正常范围");
        else if (BMI >= 24 && BMI < 27)
            System.out.println("体重过重");
        else if (BMI >= 27 && BMI < 30)
            System.out.println("轻度肥胖");
        else if (BMI >= 30 && BMI < 35)
            System.out.println("中度肥胖");
        else
            System.out.println("重度肥胖");
    }
}
