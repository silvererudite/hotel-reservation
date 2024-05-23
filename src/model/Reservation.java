package model;

import java.util.Date;

public class Reservation {
    IRoom room;
    Customer customer;
    Date checkInDate;

    Date checkOutDate;

    public Reservation(IRoom room, Customer customer, Date checkInDate, Date checkOutDate) {
        this.room = room;
        this.customer = customer;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "room=" + room +
                ", customer=" + customer +
                ", checkInDate=" + checkInDate +
                ", checkOutDate=" + checkOutDate +
                '}';
    }
}
