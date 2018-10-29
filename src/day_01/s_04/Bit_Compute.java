package day_01.s_04;
// 不使用*的二进制乘法

public class Bit_Compute {
    public static void main(String[] args) {
        int i = 2;
        int j = 17;
        int result = 0;

        String i_b = Integer.toBinaryString(i);
        int length = i_b.length();
        for (int k = 0; k < length; k++) {
            if (i_b.charAt(length - k - 1) == '1') {
                result += (j << k);
            }
        }

        System.out.println(result);
    }
}
