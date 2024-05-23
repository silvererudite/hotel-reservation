package model;

public class Room implements IRoom{

    String roomNumber;
    Double price;
    RoomType enumeration;
    Room(String roomNumber, Double price, RoomType enumeration){
        this.roomNumber = roomNumber;
        this.price = price;
        this.enumeration = enumeration;
    }
    /**
     * @return
     */
    @Override
    public String getRoomNumber() {
        return roomNumber;
    }

    /**
     * @return
     */
    @Override
    public Double getRoomPrice() {
        return price;
    }

    /**
     * @return
     */
    @Override
    public RoomType getRoomType() {
        return enumeration;
    }

    /**
     * @return
     */
    @Override
    public boolean isFree() {
        return false;
    }

    @Override
    public String toString() {
        return "Model{" +
                "roomNumber='" + roomNumber + '\'' +
                ", price=" + price +
                ", enumeration=" + enumeration +
                '}';
    }
}
