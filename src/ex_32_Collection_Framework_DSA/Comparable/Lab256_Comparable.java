package ex_32_Collection_Framework_DSA.Comparable;

import java.net.CookieHandler;
import java.sql.Struct;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lab256_Comparable {


    public static void main(String[] args) {


        Student s1  = new Student(107,"Vijay",23);
        Student s2  = new Student(104,"Jai",21);
        Student s3  = new Student(106,"Ajay",27);

        List<Student> studentList = new ArrayList();
        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);

//        List marks = new ArrayList();
//        marks.add(91);
//        marks.add(95);
//        marks.add(93);
//        marks.add(87);
//        marks.add(41);

//        Collections.sort(marks);
        Collections.sort(studentList);
        System.out.println(studentList);


    }


}

class Student implements Comparable<Student>{
    private int rollNo;
    private String name;
    private int age;

    public Student(int rollNo, String name, int age) {
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

//    @Override
//    public int compareTo(Student o) {
//        return this.rollNo-o.rollNo;
//    }

//    @Override
//    public int compareTo(Student o) {
//        return this.age-o.age;
//    }

    @Override
    public int compareTo(Student o) {
        return this.name.compareTo(o.name);
    }
}