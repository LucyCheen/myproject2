package com.tom.ticket;

public class Station {
    public static final int TAIPEI_STSTION =
            new Station(100,"Taipei");
    public static final int TAICHUNG_STSTION =
            new Station(200,"Taipei");
    public static final int KAOHSIUNG_STSTION =
            new Station(300,"Taipei");

    int id;
    String name;
    public Station(int id, String name){
        this.id = id;
        this.name = name;
    }
}
