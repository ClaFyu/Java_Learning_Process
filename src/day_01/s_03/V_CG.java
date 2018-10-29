package day_01.s_03;
// 类型转换

public class V_CG {
    public static void main(String[] args) {
        byte b = 5;  //8位长，范围到127
        int i1 = 10;
        int i2 = 300;

        b = (byte) i1;
        System.out.println(b);

        b = (byte) i2;  //byte类型只截取后8位
        System.out.println(b);
        System.out.println(Integer.toBinaryString(i2));
    }
}
