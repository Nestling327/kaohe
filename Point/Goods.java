package kaohe.Point;

public class Goods {
    private String name;
    private int prize;
    public Goods(String name,int prize){
        this.name = name;
        this.prize = prize;
    }
    public String getName() {
        return name;
    }

    public int getPrize() {
        return prize;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrize(int prize) {
        this.prize = prize;
    }
}
