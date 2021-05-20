package hotel;

import java.*;
import hotel.*;
import java.util.List;

public class Room {

    private long id;
    private long roomNumber;
    private long guestsNumber;
    private RoomCategory Category;
    private RoomStatus status;
    private double price;

    public Room(long roomNumber, long guestsNumber, RoomCategory category, RoomStatus status, double price) {
        this.roomNumber = roomNumber;
        this.guestsNumber = guestsNumber;
        this.Category = category;
        this.status = status;
        this.price = price;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(long roomNumber) {
        this.roomNumber = roomNumber;
    }

    public long getGuestsNumber() {
        return guestsNumber;
    }

    public void setGuestsNumber(long guestsNumber) {
        this.guestsNumber = guestsNumber;
    }

    public RoomCategory getCategory() {
        return Category;
    }

    public void setCategory(RoomCategory category) {
        Category = category;
    }

    public RoomStatus getStatus() {
        return status;
    }

    public void setStatus(RoomStatus status) {
        this.status = status;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}