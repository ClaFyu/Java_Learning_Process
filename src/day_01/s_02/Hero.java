package day_01.s_02;
// 属性练习

public class Hero {
    private String name;
    private float hp;
    private float armor;
    private int move_speed;
    private int kill_num;
    private int killed_num;
    private int help_num;
    private int money;
    private int little_kill_num;
    private int attack_speed;
    private String words_after_kill;
    private String words_after_killed;

    public static void main(String[] args) {
        Hero hero = new Hero();
        hero.name = "提莫";
        hero.hp = 1000;
        hero.armor = 1000;
        hero.move_speed = 1000;
    }
}
