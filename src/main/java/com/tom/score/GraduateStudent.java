package com.tom.score;

public class GraduateStudent extends Student{
    int thesis;
    public GraduateStudent(String name,
                           int englishs,
                           int maths,
                           int thesis){
        super(name, englishs, maths);
        this.thesis = thesis;
    }
    @Override
public void print(){
    System.out.println(name + "\t" + englishs+"\t" + maths + "\t" + getaverage()+"\t" +thesis);
}
}
