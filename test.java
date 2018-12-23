package kaohe;

import kaohe.FileUtil;
import kaohe.StuCenter;
import kaohe.Student;

import java.io.IOException;
import java.util.Scanner;

public class test {
    public static void main(String[] args) throws IOException {
        Student[] students;
        students = FileUtil.parseStudents("C:\\Users\\hp\\Desktop\\kaohe\\students.txt");
        Scanner sc = new Scanner(System.in);
        String stuid = sc.nextLine();
        StuCenter stuCenter = new StuCenter();
        if(!stuCenter.findstu(students,stuid)){
            System.out.println("该学生不存在!");
        }
        stuCenter.findmax(students);
        String js = sc.nextLine();
        Json json = new Json();
        json.select(js);
    }
}
