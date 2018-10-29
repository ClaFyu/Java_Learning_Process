package day_01.s_04;
// 自增与逻辑运算练习

public class Zizhen {
    public static void main(String[] args) {
        int i = 1;
        int j = ++i + i++ + ++i + ++i + i++;
        //i_input   1 2 3 4 5
        //i_output  2 3 4 5 6
        //中间结果   2 2 4 5 5

        int k = 1;
        boolean b = !(k++ == 3) ^ (k++ == 2) && (k++ == 3);
        //(i++ == 3)由于是短路与且左侧为非，故其不运算

        System.out.println(j);
        System.out.println(b);
        System.out.println(k);
    }
}
