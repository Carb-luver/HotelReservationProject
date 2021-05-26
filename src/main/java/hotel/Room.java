package hotel;

import javax.persistence.*;
import java.*;
import hotel.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name="rooms")
public class Room implements Serializable {

    @Id
    @Column(name="ID", columnDefinition="BIGINT", nullable = false)
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long Id;

    @Column(name="RoomNumber", columnDefinition="BIGINT", nullable = false)
    private long roomNumber;

    @Column(name="NumberOfGuests", columnDefinition="BIGINT", nullable = false)
    private long guestsNumber;

    @Enumerated (EnumType.STRING)
    @Column(name="Category", columnDefinition="VARCHAR", nullable = false)
    private RoomCategory Category;

    @Enumerated (EnumType.STRING)
    @Column(name="Status", columnDefinition="VARCHAR", nullable = false)
    private RoomStatus status;

    @Column(name="Price", columnDefinition="DECIMAL", nullable = false)
    private double price;

    public Room(long roomNumber, long guestsNumber, RoomCategory category, /*RoomStatus status, */double price) {
        this.roomNumber = roomNumber;
        this.guestsNumber = guestsNumber;
        this.Category = category;
        //this.status = status;
        this.price = price;
    }

    public long getId() {
        return Id;
    }
    
    public void setId(long Id) {
        this.Id = Id;
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