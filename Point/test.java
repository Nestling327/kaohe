package kaohe.Point;

public class test {
    public static void main(String[] args) {
        Student student1 = new Student("小虎");
        Teacher teacher1 = new Teacher("大熊");
        Goods goods1 = new Goods("女装",20);
        Goods goods = new Goods("PS4",50);
        teacher1.jiafen(student1,100);
        Market market = new Market();
        market.jinhuo(goods1);
        market.jinhuo(goods1);
        market.jinhuo(goods);
        market.sold(student1);
        market.sold(student1);
        market.sold(student1);
        student1.shou();
    }
}
