package com.tom.sales;

public class SilverCustomer extends Customer2 {
    public SilverCustomer(String id,int amount){
        super(id,amount);
    }
    @Override
    public void print(){
        System.out.println(id + "\t" + amount + "\t" + (amount-offMoney())+"("+ offMoney() + ")");
    }
}

