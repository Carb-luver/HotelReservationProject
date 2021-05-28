package hotel;

import java.*;
import hotel.*;
import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="Reservations")
public class Reservation implements Serializable {

    @Id
    @Column(name="ID", columnDefinition="BIGINT", nullable = false)
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long Id;

    @Column(name="RoomId", columnDefinition="BIGINT", nullable = false)
    private long roomId;

    @Column(name="UserId", columnDefinition="BIGINT", nullable = false)
    private long userId;

    @Column(name="Price", columnDefinition="DECIMAL", nullable = false)
    private double price;

    @Enumerated (EnumType.STRING)
    @Column(name="ReservationStatus", columnDefinition="VARCHAR", nullable = false)
    private ReservationStatus status;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="StartDate", columnDefinition="TIMESTAMP", nullable = false)
    private Date startDate;

    public Reservation(long roomId, long userId, double price, ReservationStatus status, Date startDate) {
        this.roomId = roomId;
        this.userId = userId;
        this.price = price;
        this.status = status;
        this.startDate = startDate;
    }
    
    public Reservation() {
	}

	public long getId() {
        return Id;
    }


    public long getRoomId() {
        return roomId;
    }

    public void setRoomId(long roomId) {
        this.roomId = roomId;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public ReservationStatus getStatus() {
        return status;
    }

    public void setStatus(ReservationStatus status) {
        this.status = status;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Timestamp startDate) {
        this.startDate = startDate;
    }
}