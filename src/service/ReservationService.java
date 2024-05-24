package service;

import model.Customer;
import model.IRoom;
import model.Reservation;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

public class ReservationService {

    private static final ReservationService reservationService = new ReservationService();

    List<Reservation> customerReservations = new ArrayList<Reservation>();
    public void addRoom(IRoom room){}
    public IRoom getARoom(String roomId){}
    public Reservation reserveARoom(Customer customer, IRoom room, Date checkInDate, Date checkOutDate){}
    public Collection<IRoom> findRooms(Date checkInDate, Date checkOutDate){}
    public Collection<Reservation> getCustomerReservation(Customer customer){}

    public void printAllReservation(){}


}
