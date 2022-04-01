package com.tom.ticket;

public class Ticket {
    public static final int TAIPEI_STSTION = 100;
    public static final int TAICHUNG_STSTION = 200;
    public static final int KAOHSIUNG_STSTION = 300;

    Station start;
    Station destination;
    int price;
    public Ticket(Station start,Station destination){
        this.start = start;
        this.destination = destination;
        if(start==Station.TAIPEI_STSTION){
            if (destination==Station.TAICHUNG_STSTION){
                price = 600;
            }else {
                price = 1500;
            }
        }else if (start == Station.TAICHUNG_STSTION){
            if(destination == Station.TAIPEI_STSTION){
                price = 600;
            }else {
                price = 900;
            }
        }else if (start == Station.KAOHSIUNG_STSTION){
            if(destination == Station.TAICHUNG_STSTION){
                price = 900;
            }else {
                price = 1500;
            }
        }
    }
    public void print(){
        System.out.println(start.name + "\t" + destination.name + "\t" + price);
    }

}
