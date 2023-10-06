package com.mavericapps.hotelms.domain;

public class Hotel {
    private long id;
    private String name;
    private Room[] rooms=new Room[10];

    public Hotel(long id,String name){
        this.id=id;
        this.name=name;
    }
    public Hotel(long id,String name,Room[]rooms){
        this.id=id;
        this.name=name;
        this.rooms=rooms;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Room[] getRooms() {
        return rooms;
    }

    public void setRooms(Room[] rooms) {
        this.rooms = rooms;
    }
}
