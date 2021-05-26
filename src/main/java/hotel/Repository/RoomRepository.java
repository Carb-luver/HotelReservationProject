package hotel.Repository;

import hotel.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoomRepository extends JpaRepository<Room, String> {
        
    Room findById(@Param("Id") long roomId);

    Room findByRoomId(@Param("roomNumber") long roomNumber);
    
    List<Room> findByNumberOfGuestsAndCategory(long guestsNumber, RoomCategory Category);
	
}