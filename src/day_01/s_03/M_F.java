package day_01.s_03;
// 作用域问题

public class M_F {
    int i = 1;
    public void method(int i) {
        System.out.println(i);
    }

    public static void main(String[] args) {
        new M_F().method(5);  //就近原则，与method方法相近的参数i是11行的5
    }
}
