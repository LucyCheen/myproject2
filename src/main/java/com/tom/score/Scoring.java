package com.tom.score;

public class Scoring {
    public static void main(String[] args) {
        Student cody = new Student("Cody",80,45);
        Student apple = new Student("Apple",70,20);
        GraduateStudent jane = new GraduateStudent("Jane",70,30,50);

        cody.print();
        apple.print();
        jane.print();
    }
}
