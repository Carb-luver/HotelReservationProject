package hotel.dto;

import hotel.RoomCategory;
import hotel.RoomStatus;

public class UpdateRoomRequest {
	
	private long roomNumber;
	private long guestsNumber;
    private RoomCategory category;
    private RoomStatus status;
    private double price;
    
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
		return category;
	}
	public void setCategory(RoomCategory category) {
		this.category = category;
	}
	public RoomStatus getStatus() {
		return status;
	}
	void setStatus(RoomStatus status) {
		this.status = status;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
    
}
