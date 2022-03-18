package com.tom;

public class GoldCustomer extends SilverCustomer{
    public GoldCustomer(String id,int amount){
        super(id, amount);
        off = 0.2f;
    }
}
