package kaohe.Point;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Teacher {
    private String name;
    private int point=0;
    private HashMap<Goods,Integer> goods = new HashMap<>();
    public Teacher(String name){
        this.name = name;
    }
    public void get (Goods goods1){
        if (goods.get(goods1)==null){
            goods.put(goods1,1);
        }else {
            goods.put(goods1,goods.get(goods1)+1);
        }
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public String getName() {
        return name;
    }

    public int getPoint() {
        return point;
    }
    public void jiafen(Student student,int point){
        student.setPoint(student.getPoint()+point);
    }
    public void shou(){
        Iterator iter = goods.entrySet().iterator();
        while (iter.hasNext()){
            Map.Entry entry = (Map.Entry) iter.next();
            Goods key1 = (Goods)entry.getKey();
            String key = key1.getName();
            int val = (int) entry.getValue();
            System.out.print("现在你有: ");
            System.out.println(key+val+"件");
        }
    }
}
