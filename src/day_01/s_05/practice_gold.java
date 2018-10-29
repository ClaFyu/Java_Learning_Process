package day_01.s_05;
// 黄金分割点

import javafx.util.Pair;

public class practice_gold {

    public static void main(String[] args) {
        double rate = 0.618;
        double distance = 100;
        Pair<Integer, Integer> pair = null;

        for (int i = 1; i <= 20; i++){
            for (int j = 1; j <= 20; j++){
                if (i % 2 == 0 && j % 2 == 0)
                    continue;
                double absd = Math.abs((double)i / (double)j - rate);
                if (absd <= distance) {
                    distance = absd;
                    pair = new Pair<>(i, j);
                }
            }
        }

        System.out.println(pair.getKey());
        System.out.println(pair.getValue());
    }
}
