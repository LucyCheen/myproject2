package com.tom.score;

public class Student {
    String name;
    int englishs;
    int maths;
    public Student(String name){
        this.name = name;
    }
    public Student(String name,int englishs,int maths){
    //this.name = name;
    this(name);
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
        System.out.print(name + "\t" + englishs+"\t" + maths + "\t" + getaverage());
        if (getaverage() < 60){
            System.out.print("*");
        }
        System.out.println();
    }
    public int getaverage(){
        return ((englishs+maths)/2);
    }
}