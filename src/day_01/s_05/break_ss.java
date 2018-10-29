package day_01.s_05;
// break练习

public class break_ss {
    public static void main(String[] args) {
        long sum = 0L;
        int p = 12000;
        double r = 0.05;
        for (int i = 1; i < 100; i++) {
            sum += (long) p * Math.pow(1 + r, i);
            if (sum >= 1000000) {
                System.out.println("需要" + i + "年。");
                break;
            }
        }
    }
}
