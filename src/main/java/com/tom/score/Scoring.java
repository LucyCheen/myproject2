package com.tom.score;

import com.tom.GraduateStudent;

import java.util.ArrayList;
import java.util.List;

public class Scoring {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Cody",80,45));
        students.add(new Student("Apple",70,20));
        students.add(new GraduateStudent("Jane",70,30,50));
        for (int i = 0; i < 3; i++) {
            students.get(i).print();
        }
        //for (Student n : students){
        //    n.print();
        //}
    }
}
