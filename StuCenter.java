package kaohe;

import kaohe.Student;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class StuCenter {
    public boolean findstu(Student[] students, String stuid) {
        boolean flag = false;//2015210001,2015214780,2016210001,2016216001,2017210001,2017215198,2018214967;
        System.out.println(stuid);
        int qian = Integer.parseInt(stuid.substring(0,4));
        int hou = Integer.parseInt(stuid.substring(4,7));
        int fin = Integer.parseInt(stuid.substring(7,10));
        System.out.println(qian+" "+hou+" "+fin);
        if (qian == 2015) {//2015210001,2015214780  0,4775
            if (hou>=210&&hou<=214) {
                System.out.println("存在" + students[(hou-210)*999+fin-1].getName());
                flag = true;
                return flag;
            }
        } else if (qian == 2016) {//2016210001,2016216001 4776,4776+5993
            if (hou>=210&&hou<=216) {
                System.out.println("存在" + students[4775+(hou-210)*999+fin].getName());
                flag = true;
                return flag;
            }
        } else if (qian == 2017) {//2017210001,2017215198
            if(hou>=210&&hou<=215){
                System.out.println("存在" + students[4775+5994+(hou-210)*999+fin].getName());
                flag = true;
                return flag;
            }
        } else if (qian == 2018) {//2018214967
            if (hou>=210&&hou<=214){
                System.out.println("存在" + students[4775+5994+5193+(hou-210)*1000+fin].getName());
                flag = true;
                return flag;
            }
        }
        return flag;
    }
    public void findmax(Student[] students){
        int max=1;
        int temp;
        HashMap<String,Integer> map = new HashMap<>();
        for (int i=0;i<students.length;i++){
            if (map.get(students[i].getName())==null){
                map.put(students[i].getName(),1);
            }else {
                temp =1+map.get(students[i].getName());
                if (max<temp) max = temp;
                map.put(students[i].getName(),temp);
            }
        }
        Iterator iter = map.entrySet().iterator();
        while (iter.hasNext()){
            Map.Entry entry = (Map.Entry) iter.next();
            String key = (String) entry.getKey();
            int val = (int) entry.getValue();
            if (val==max) System.out.println(key);
        }
    }
}

