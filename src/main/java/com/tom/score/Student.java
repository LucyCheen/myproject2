package com.tom.score;

//修飾字(子) Modifier  public/default(package)/private/protected(子)
public class Student implements Printable{
    protected String name;
    protected int englishs;
    protected int maths;
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
    @Override
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