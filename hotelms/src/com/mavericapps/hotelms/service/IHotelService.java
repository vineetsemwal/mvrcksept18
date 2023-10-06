package com.mavericapps.hotelms.service;

import com.mavericapps.hotelms.domain.Guest;
import com.mavericapps.hotelms.exceptions.GuestNotFoundException;
import com.mavericapps.hotelms.exceptions.InvalidHotelIdException;
import com.mavericapps.hotelms.exceptions.InvalidRoomNumberException;
import com.mavericapps.hotelms.exceptions.RoomNotFoundException;

public interface IHotelService {
    Guest findGuestCheckedInRoom(long hotelId, int roomNo)throws InvalidHotelIdException,
            InvalidRoomNumberException, RoomNotFoundException, GuestNotFoundException;
}
