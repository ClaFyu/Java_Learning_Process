package day_01.s_02;
// 类与对象练习

public class Item {
    private String name;
    private int price;

    private void bottle(String name, int price) {
        this.name = name;
        this.price = price;
        System.out.println("名称是：" + this.name + "，价格是：" + this.price + "。");
    }

    private void shoe(String name, int price) {
        this.name = name;
        this.price = price;
        System.out.println("名称是：" + this.name + "，价格是：" + this.price + "。");
    }

    private void sword(String name, int price) {
        this.name = name;
        this.price = price;
        System.out.println("名称是：" + this.name + "，价格是：" + this.price + "。");
    }

    public static void main(String[] args) {
        Item a = new Item();
        a.bottle("血瓶", 50);
        a.shoe("草鞋", 300);
        a.sword("长剑", 350);
    }
}
