package day_01.s_07.Chuancan;
// 传参

public class Hero {
    private String name; //姓名
    private float hp; //血量
    private float armor; //护甲
    private int moveSpeed; //移动速度

    public Hero() {

    }

    public Hero(String name, float hp) {
        this.name = name;
        this.hp = hp;
    }

    public void revive(Hero h) {  //并不传参，生成的teemo的仅在revive内生效
        h = new Hero("提莫", 383);
    }

    public static void main(String[] args) {
        Hero teemo = new Hero("提莫", 383);
        teemo.hp = teemo.hp - 400;
        teemo.revive(teemo);  //若revive是一个可返回Hero类型的方法，则结果为383

        System.out.println(teemo.hp);
    }
}
