package com.tom;

public class SilverCustomer extends Customer2 {
    int GiveMoney;
    public SilverCustomer(String id,int amount){
        super(id,amount);
    }
    @Override
    public void print(){
        System.out.println(id + "\t" + amount + "\t" + (amount-offMoney())+"("+ offMoney() + ")");
    }
}
