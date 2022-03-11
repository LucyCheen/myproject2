package com.tom;

public class Scoring {
    public static void main(String[] args) {
        Student cody = new Student("Cody",80,45);
        Student toy = new Student("Toy",70,20);
        GraduateStudent jane = new GraduateStudent("Jane",70,30,50);

        cody.print();
        toy.print();
        jane.print();
    }
}
