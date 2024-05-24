package api;

import model.Customer;
import model.IRoom;
import model.Reservation;

import java.util.Collection;
import java.util.Date;

public class HotelResource {

    private static final HotelResource hotelRes = new HotelResource();
    public Customer getCustomer(String email){}
    public void createCustomer(String email, String firstName, String lastName){}
    public IRoom getRoom(String roomNumber){}
    public Reservation bookARoom(Customer customer, IRoom room, Date checkInDate, Date checkOutDate){}

    public Collection<Reservation> getCustomerReservations(String customerEmail){}

    public Collection<IRoom> findARoom(Date checkIn, Date checkOut){}
}
