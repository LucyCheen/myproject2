package com.tom.ticket;

public class Station {
    public static final Station TAIPEI_STSTION =
            new Station(100,"Taipei");
    public static final Station TAICHUNG_STSTION =
            new Station(200,"Taichung");
    public static final Station KAOHSIUNG_STSTION =
            new Station(300,"Kaohsiung");

    int id;
    String name;
    public Station(int id, String name){
        this.id = id;
        this.name = name;
    }
}
