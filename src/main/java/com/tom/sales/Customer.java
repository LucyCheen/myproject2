package com.tom.sales;
// 一般客戶 - 滿千送百
// 銀級客戶 - 滿千送百, 再送百元還原金
// 金級客戶 - 滿千送二百, 再送二百還原金
// 001 1200 1100
// 002 800 800
//003 2000 1800(200)<--銀級客戶
//004 5000 4000(1000)<--金及客戶
public class Customer {
    public static void main(String[] args) {
        Customer2 c1 = new Customer2("001",1200);
        Customer2 c2 = new Customer2("002",800);
        SilverCustomer c3 = new SilverCustomer("003",2000);
        GoldCustomer c4 = new GoldCustomer("004",5000);

        c1.print();
        c2.print();
        c3.print();
        c4.print();
    }
}
