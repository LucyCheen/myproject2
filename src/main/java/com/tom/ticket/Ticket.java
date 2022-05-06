package com.tom.ticket;

public class Ticket {
    public static final int TAIPEI_STSTION = 100;
    public static final int TAICHUNG_STSTION = 200;
    public static final int KAOHSIUNG_STSTION = 400;

    Station start;
    Station destination;
    int price;
    public Ticket(Station start,Station destination){
        this.start = start;
        this.destination = destination;
        int diff = Math.abs(start.id - destination.id);
        System.out.println("diff:" + diff);
        switch (diff){
            case 100:
                price = 500;
                break;
            case 200:
                price = 600;
                break;
            case 300:
                price = 1100;
                break;
        }
        /*if(start==Station.TAIPEI_STSTION){
            if (destination==Station.TAICHUNG_STSTION){
                price = 500;
            }else {
                price = 1100;
            }
        }else if (start == Station.TAICHUNG_STSTION){
            if(destination == Station.TAIPEI_STSTION){
                price = 500;
            }else {
                price = 600;
            }
        }else if (start == Station.KAOHSIUNG_STSTION){
            if(destination == Station.TAICHUNG_STSTION){
                price = 600;
            }else {
                price = 1100;
            }
        }  */
    }
    public void print(){
        System.out.println(start.name + "\t" + destination.name + "\t" + price);
    }

}
