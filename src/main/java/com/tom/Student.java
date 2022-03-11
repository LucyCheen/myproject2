package com.tom;

import java.sql.SQLOutput;

public class Student {
    String name;
    int englishs;
    int maths;
    public Student(String name){
        this.name = name;
    }
    public Student(String name,int englishs,int maths){
    //this.name = name;
    this.englishs = englishs;
    this.maths = maths;
    }
    public Student (){
        this ("Jone Doe",-1,-1);
        /*this("John Doe",-1,-1)
        name = "John Doe";
        englishs = -1
        maths = -1;*/
    }
    public void print(){
        int average = ((englishs+maths)/2);
        System.out.print(name + "\t" + englishs+"\t" + maths + "\t" + average);
        if (average < 60){
            System.out.print("*");
        }
        System.out.println();
    }
}