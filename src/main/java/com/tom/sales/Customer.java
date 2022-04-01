package com.tom.sales;

import java.util.ArrayList;
import java.util.List;

// 一般客戶 - 滿千送百
// 銀級客戶 - 滿千送百, 再送百元還原金
// 金級客戶 - 滿千送二百, 再送二百還原金
//added after:
//customer get 10% off discount
//customer get 30% off and 20% point
// 001 1200 1100
// 002 800 800
//003 2000 1800(200)<--銀級客戶
//004 5000 4000(1000)<--金級客戶
/*
父類別的參照可以放 子類別所產生的物件
 */
public class Customer {
    public static void main(String[] args) {
        List<Customer2>customers = new ArrayList<>();
        customers.add(new Customer2("001",1200));
        customers.add(new Customer2("002",800));
        customers.add(new SilverCustomer("003",2000));
        customers.add(new GoldCustomer("004",5000));
        customers.add(new DiscountCustomer("005",900));
        //for (int i = 0; i < 5; i++) {
        //    customers.get(i).print();
        //}
        for(Customer2 c: customers){
            c.print();
        }

    }
}
