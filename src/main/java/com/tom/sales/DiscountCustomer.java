package com.tom.sales;

public class DiscountCustomer extends Customer2 {
    public DiscountCustomer (String id,int amount){
        super(id, amount);
        off = 0.9f;
    }
    @Override
    public void print(){
        System.out.println(id + "\t" + amount + "\t" + amount*off);
    }
}
