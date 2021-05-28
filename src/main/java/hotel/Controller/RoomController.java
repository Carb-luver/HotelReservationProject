package hotel.Controller;

import java.util.List;

import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import hotel.Room;
import hotel.RoomCategory;
import hotel.RoomStatus;
import hotel.User;
import hotel.UserRole;
import hotel.Service.PermissionService;
import hotel.Service.RoomService;
import hotel.Service.UserService;
import hotel.dto.CreateRoomRequest;
import hotel.dto.UpdateRoomRequest;

@RestController
public class RoomController {
	
	@Secured(UserRole.ADMINISTRATOR)
	public void createRoom(@RequestBody CreateRoomRequest request){
		Room room = RoomService.createRoom(request);
	}

	public Room findRoomById(@PathVariable long roomId){
		Room room = RoomService.findRoomById(roomId);
		return room;
	}

	@Secured(UserRole.ADMINISTRATOR)
	public List<Room> findAllRooms(@PathVariable long userId){
		List<Room> roomList = RoomService.findAllRooms(userId);
		return roomList;
	}
	
	@Secured(UserRole.ADMINISTRATOR)
	public Room findRoomByRoomId(@PathVariable long roomId){
		Room room = RoomService.findRoomByRoomId(roomId);
		return room;
	}

	@Secured(UserRole.ADMINISTRATOR)
	public Room editRoomStatus(@PathVariable long userId, @PathVariable long roomId, @RequestParam RoomStatus status){
		Room room = RoomService.findRoomById(roomId);
		room.setId(userId);
		room.setStatus(status);
		RoomService.saveRoom(room);
		return room;
	}
	
	@Secured(UserRole.ADMINISTRATOR)
	public Room editRoomInfo(@PathVariable("user_id") long userId, @PathVariable long roomId, @RequestBody UpdateRoomRequest request){
		Room room = RoomService.findRoomById(roomId);
		room.setId(userId);
		room.setRoomNumber(request.getRoomNumber());
		room.setGuestsNumber(request.getGuestsNumber());
		room.setCategory(request.getCategory());
		room.setStatus(request.getStatus());
		room.setPrice(request.getPrice());
		RoomService.saveRoom(room);
		return room;
	}
	
	public List<Room> findAvailableRoomsByGuestsNumberAndCategory (@PathVariable long guestsNumber, @PathVariable RoomCategory category){
		List<Room> roomList = RoomService.findAvailableRoomsByGuestsNumberAndCategory(guestsNumber, category);
		return roomList;
	}
	
}