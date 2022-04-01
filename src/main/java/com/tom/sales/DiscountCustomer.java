package com.tom.sales;

public class DiscountCustomer extends Customer2 {
    public DiscountCustomer (String id,int amount){
        super(id, amount);
    }
    @Override
    public float offMoney(){
        return amount*off;
    }

}
