package hotel.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import hotel.Room;
import hotel.*;
import hotel.Repository.RoomRepository;
import hotel.dto.CreateRoomRequest;
import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
public class RoomService {
	
	static RoomRepository roomRepository;

	public static Room createRoom(CreateRoomRequest request) {
		Room room = new Room(request.getRoomNumber(), request.getGuestsNumber(), request.getCategory(),request.getPrice());
		roomRepository.save(room);
		return room;
	}
	
	public static void saveRoom(Room room){
		roomRepository.save(room);
	}
	
	public static Room findRoomById(long roomId){
		Room room = roomRepository.findById(roomId);
		return room;
	}
	
	@Secured("ADMINISTRATOR")
	public static Room findRoomByRoomId(long roomId){
		Room room = roomRepository.findById(roomId);
		return room;
	}
	
	@Secured("ADMINISTRATOR")
	public static List<Room> findAllRooms(long userId){
		List<Room> roomList = roomRepository.findAll();
		return roomList;
	}
	
	public static List<Room> findAvailableRoomsByGuestsNumberAndCategory (long guestsNumber, RoomCategory category){
		List<Room> roomList = roomRepository.findByNumberOfGuestsAndCategory(guestsNumber, category);
		return roomList;
	}
	
}
