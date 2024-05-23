package model;

public class FreeRoom extends Room{
    FreeRoom(String roomNumber, Double price, RoomType enumeration){
        super(roomNumber, 0.0, enumeration);
    }

    @Override
    public String toString() {
        return "FreeRoom{" +
                "roomNumber='" + roomNumber + '\'' +
                "} " + super.toString();
    }
}
