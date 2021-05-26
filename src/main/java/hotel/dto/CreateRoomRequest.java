package hotel.dto;

import org.springframework.stereotype.Service;

import hotel.RoomCategory;
import hotel.RoomStatus;

@Service
public class CreateRoomRequest {
	
    private long roomNumber;
	private long guestsNumber;
    private RoomCategory Category;
    private double price;
    
	public long getRoomNumber() {
		return roomNumber;
	}
	void setRoomNumber(long roomNumber) {
		this.roomNumber = roomNumber;
	}
	public long getGuestsNumber() {
		return guestsNumber;
	}
	void setGuestsNumber(long guestsNumber) {
		this.guestsNumber = guestsNumber;
	}
	public RoomCategory getCategory() {
		return Category;
	}
	void setCategory(RoomCategory category) {
		Category = category;
	}
	public double getPrice() {
		return price;
	}
	void setPrice(double price) {
		this.price = price;
	}
	
}
