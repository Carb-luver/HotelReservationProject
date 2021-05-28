package hotel.Repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import hotel.Reservation;
import hotel.User;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation, Long> {
		
	Reservation findByReservationId(@Param("ID") long id);

	List<Reservation> findByUserId(@Param("UserId") long userId);	
	
	List<Reservation> findAllByStatus(@Param("Status") ReservationStatus status);
	
	List <Reservation> findAll();
	
}
