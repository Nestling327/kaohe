package kaohe.Point;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Student {
    private String name;
    private int point=0;
    private HashMap<Goods,Integer> goods = new HashMap<>();
    public Student (String name){
        this.name = name;
    }
    public void get (Goods goods1){
        if (goods.get(goods1)==null){
            goods.put(goods1,1);
        }else {
            goods.put(goods1,goods.get(goods1)+1);
        }
    }

    public int getPoint() {
        return point;
    }

    public String getName() {
        return name;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void shou(){
        Iterator iter = goods.entrySet().iterator();
        while (iter.hasNext()){
            Map.Entry entry = (Map.Entry) iter.next();
            Goods key1 = (Goods)entry.getKey();
            String key = key1.getName();
            int val = (int) entry.getValue();
            System.out.print("现在你有:");
            System.out.println(key+val+"件");
        }
    }
}
