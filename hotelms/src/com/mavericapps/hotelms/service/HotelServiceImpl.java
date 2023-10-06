package com.mavericapps.hotelms.service;

import com.mavericapps.hotelms.common.RoomType;
import com.mavericapps.hotelms.domain.Guest;
import com.mavericapps.hotelms.domain.Hotel;
import com.mavericapps.hotelms.domain.Room;
import com.mavericapps.hotelms.exceptions.GuestNotFoundException;
import com.mavericapps.hotelms.exceptions.InvalidHotelIdException;
import com.mavericapps.hotelms.exceptions.InvalidRoomNumberException;
import com.mavericapps.hotelms.exceptions.RoomNotFoundException;

public class HotelServiceImpl implements IHotelService{
    private Hotel[] hotelStore =new Hotel[10];
    public HotelServiceImpl(){
        init();
    }

    public void init(){
        Room room1=new Room(1,2, RoomType.Standard);
        Room room2=new Room(2,1, RoomType.Deluxe);
        Hotel radisson=new Hotel(1,"radisson");
        hotelStore[0]=radisson;
        Room[]radissonRooms=radisson.getRooms();
        radissonRooms[0]=room1;
        radissonRooms[1]=room2;
        Guest guest=new Guest(10,"ajay","kalburgi","ajay@gmail.com");
        room1.setCheckedIn(guest);

        hotelStore[1]=new Hotel(2,"jp");
    }

    @Override
    public Guest findGuestCheckedInRoom(long hotelId, int roomNo)
            throws InvalidHotelIdException,InvalidRoomNumberException, RoomNotFoundException,GuestNotFoundException{
       validateHotelId(hotelId);
       validateRoomNumber(roomNo);
        for (Hotel hotel:hotelStore){
            if(hotel!=null && hotel.getId()==hotelId ){
                Room room=findRoomByRoomNo(hotel,roomNo);
                Guest guest=room.getCheckedIn();
                if(guest==null){
                    throw new GuestNotFoundException("guest is not checked in");
                }
                return guest;
            }
        }
        throw new GuestNotFoundException("guest is not checked in");
    }

    Room findRoomByRoomNo(Hotel hotel, int roomNo)throws RoomNotFoundException{
        for (Room room: hotel.getRooms()){
            if(room!=null && room.getRoomNumber()==roomNo){
               return room;
            }
        }

        throw new RoomNotFoundException("room not found by roomno="+roomNo);
    }

    void validateHotelId(long hotelId)throws InvalidHotelIdException{
        if(hotelId<1){
            throw new InvalidHotelIdException("hotel id invalid");
        }
    }
    void validateRoomNumber(int roomNo)throws InvalidRoomNumberException{
        if(roomNo<1){
            throw new InvalidRoomNumberException("hotel id invalid");
        }
    }
}

