package day_01.s_07.inheritance;

public class Armor extends Item {
    private int ac;

    public static void main(String[] args) {
        Armor Bujia = new Armor();
        Armor Suozijia = new Armor();

        Bujia.name = "布甲";
        Bujia.price = 300;
        Bujia.ac = 15;

        Suozijia.name = "锁子甲";
        Suozijia.price = 500;
        Suozijia.ac = 40;
    }
}
