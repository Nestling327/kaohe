package kaohe.Point;

import java.util.*;

public class Market {
    private HashMap<Goods,Integer> goods = new HashMap<>();
    public void jinhuo(Goods goods1){
        if (goods.get(goods1)==null){
            goods.put(goods1,1);
        }else {
            goods.put(goods1,goods.get(goods1)+1);
        }
    }
    public void sold(Student student){
        System.out.println(student.getName()+"拥有积分："+student.getPoint());
        Iterator iter = goods.entrySet().iterator();
        System.out.println("现在超市有：");
        while (iter.hasNext()){
            Map.Entry entry = (Map.Entry) iter.next();
            Goods key1 = (Goods) entry.getKey();
            String key = key1.getName();
            int val = (int) entry.getValue();
            System.out.println(key+"库存："+val);
        }
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i=1;
        for (Iterator<Map.Entry<Goods, Integer>> it = goods.entrySet().iterator(); it.hasNext();){
            Map.Entry<Goods, Integer> item = it.next();
            if (n==i){
                if (student.getPoint()>=item.getKey().getPrize()){
                    student.setPoint(student.getPoint()-item.getKey().getPrize());
                    System.out.println("目前积分:"+student.getPoint());
                    if (item.getValue()==1){
                        System.out.println(item.getKey().getName()+"已经买完请进货 ");
                        student.get(item.getKey());
                        it.remove();
                    }else {
                        item.setValue(item.getValue()-1);
                        student.get(item.getKey());
                    }
                }else {
                    System.out.println("积分不足！,请找学长加分");
                }
            }
            i++;
        }
    }
    public void sold(Teacher teacher){
        System.out.println(teacher.getName()+"拥有积分："+teacher.getPoint());
        Iterator iter = goods.entrySet().iterator();
        while (iter.hasNext()){
            Map.Entry entry = (Map.Entry) iter.next();
            String key = (String) entry.getKey();
            int val = (int) entry.getValue();
            System.out.println("现在超市有： ");
            System.out.println(key+"库存："+val);
        }
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i=1;
        for (Iterator<Map.Entry<Goods, Integer>> it = goods.entrySet().iterator(); it.hasNext();){
            Map.Entry<Goods, Integer> item = it.next();
            if (n==i){
                if (teacher.getPoint()>=item.getKey().getPrize()){
                    teacher.setPoint(teacher.getPoint()-item.getKey().getPrize());
                    System.out.println("目前积分："+teacher.getPoint());
                    if (item.getValue()==1){
                        System.out.println(item.getKey()+"已经买完请进货!");
                        teacher.get(item.getKey());
                        it.remove();
                    }else {
                        item.setValue(item.getValue()-1);
                        teacher.get(item.getKey());
                    }
                }else {
                    System.out.println("积分不足");
                }
            }
            i++;
        }
    }
}
