package com.mavericapps.hotelms.ui;

import com.mavericapps.hotelms.domain.*;
import com.mavericapps.hotelms.exceptions.GuestNotFoundException;
import com.mavericapps.hotelms.exceptions.InvalidHotelIdException;
import com.mavericapps.hotelms.exceptions.InvalidRoomNumberException;
import com.mavericapps.hotelms.exceptions.RoomNotFoundException;
import com.mavericapps.hotelms.service.HotelServiceImpl;
import com.mavericapps.hotelms.service.IHotelService;

public class App {
    private IHotelService service = new HotelServiceImpl();

    public static void main(String[] args) {
        App app = new App();
        app.startApp();
    }

    void startApp() {
        try {
            Guest guest = service.findGuestCheckedInRoom(1, 1);
            displayGuest(guest);
        } catch (InvalidHotelIdException e) {
            System.out.println(e.getMessage());
        } catch (InvalidRoomNumberException e) {
            System.out.println(e.getMessage());
        } catch (RoomNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (GuestNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    void displayGuest(Guest guest) {
        System.out.println("Guest:" + guest.getId() + "-" + guest.getFirstName() + "-" + guest.getLastName());
    }

}
