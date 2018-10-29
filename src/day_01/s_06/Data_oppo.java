package day_01.s_06;
// 数组数据反转

public class Data_oppo {
    public static void main(String[] args) {
        int a[] = new int[10];
        for (int i = 0; i < 10; i++) {
            a[i] = (int) (Math.random() * 100);
        }

        for (int i = 0; i < a.length / 2; i++) {
            int tmp = a[i];
            a[i] = a[a.length - i - 1];
            a[a.length - i - 1] = tmp;
        }
    }
}
