package com.tom;

public class ScoringNG {
    public static void main(String[] args) {
        String[]names={"Cody","Kiki","Lucy","Len","Bobo "};
        int[]englishs={80,85,95,62,40};
        int[]maths={45,88,64,90,70};
        for(int i=0; i<5 ;i++){
            if(i !=3){
                System.out.println(names[i]+"\t"+englishs[i]+"\t"+maths[i]+"\t"+(englishs[i]+maths[i])/2+"\t");
            }
        }
    }
}
