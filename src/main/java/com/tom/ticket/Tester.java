package com.tom.ticket;

import java.util.Scanner;
/* 台北  台中  高雄
   100  200  300
      500  600
   <====1100====>
 */



public class Tester {
    public static void main(String[] args) {
        Ticket ticket = new Ticket(
                Station.TAIPEI_STSTION,
                Station.KAOHSIUNG_STSTION);
        Scanner scanner = new Scanner(System.in);
        System.out.println("You start station?(1: Taipei, 2:Taichung, 3:Kaohsiung)");
        int choice = Integer.parseInt(scanner.next());
        Station start = null;
        switch (choice){
            case 1 :
                start = Station.TAIPEI_STSTION;
                break;
            case 2 :
                start = Station.TAICHUNG_STSTION;
                break;
            case 3 :
                start = Station.KAOHSIUNG_STSTION;
                break;
        }
        System.out.println("You destination station?(1: Taipei, 2:Taichung, 3:Kaohsiung)");
        choice = Integer.parseInt(scanner.next());
        Station destination = null;
        switch (choice){
            case 1 :
                destination = Station.TAIPEI_STSTION;
                break;
            case 2 :
                destination = Station.TAIPEI_STSTION;
                break;
            case 3 :
                destination = Station.TAIPEI_STSTION;
                break;
        }
        System.out.println("Which kind of ticket? 1)Normal ticket 2)Student ticket 3)Elder ticket");
        choice = Integer.parseInt(scanner.next());
        switch (choice){
            case 1 :
                ticket = new Ticket(start,destination);
                break;
            case 2 :
                ticket = new StudentTicket(start,destination);
                break;
            case 3 :
                ticket = new ElderTicket(start,destination);
                break;
        }
        ticket.print();
    }
}
