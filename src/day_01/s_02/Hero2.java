package day_01.s_02;
// 方法练习

public class Hero2 {
    private String name;
    private float hp;
    private float armor;
    private int move_speed;

    void legendary() {
        System.out.println("超神了");
    }

    float getHp() {
        return hp;
    }

    void recovery(float blood) {
        hp = hp + blood;
    }

    public static void main(String[] args) {
        Hero2 garen = new Hero2();
        garen.name = "盖伦";
        garen.hp = 1000;
        garen.armor = 200;
        garen.move_speed = 350;

        garen.legendary();
        System.out.println(garen.getHp());
        garen.recovery(300);
        System.out.println(garen.getHp());
    }
}
