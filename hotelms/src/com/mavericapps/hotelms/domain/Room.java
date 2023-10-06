package com.mavericapps.hotelms.domain;

import com.mavericapps.hotelms.common.RoomType;

public class Room {
    private int roomNumber;
    private int floor;
    private Guest checkedIn;
    private RoomType roomType; // deluxe or normal

    public Room(int roomNumber, int floor, RoomType roomType){
        this.roomNumber=roomNumber;
        this.floor=floor;
        this.roomType=roomType;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public Guest getCheckedIn() {
        return checkedIn;
    }

    public void setCheckedIn(Guest checkedIn) {
        this.checkedIn = checkedIn;
    }

    public RoomType getRoomType() {
        return roomType;
    }

    public void setRoomType(RoomType roomType) {
        this.roomType = roomType;
    }

}
