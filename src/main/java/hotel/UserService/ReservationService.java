package hotel.Service;

import java.util.Date;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.security.access.annotation.Secured;
import hotel.Reservation;
import hotel.ReservationStatus;
import hotel.Room;
import hotel.RoomStatus;
import hotel.UserRole;
import hotel.Repository.*;
import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
public class ReservationService {

	static ReservationRepository reservationRepository;
	static RoomRepository roomRepository;
	
	public static void createReservation(long roomId, long UserId, double price, ReservationStatus status, Date startDate){
		Reservation reservation = new Reservation(roomId, UserId, price, status, startDate);
		reservationRepository.save(reservation);
	}
	
	List<Reservation> findAllByStatus(ReservationStatus status){
		List<Reservation> reservationList = reservationRepository.findAllByStatus(status);
		return reservationList;
	}
	
	@Secured(UserRole.ADMINISTRATOR)
	public static Reservation confirmReservation(long userId, long reservationId){
		Reservation reservation = reservationRepository.findByReservationId(reservationId);
		Room room = roomRepository.findById(reservation.getRoomId());
		reservation.setStatus(ReservationStatus.CONFIRMED);
		room.setStatus(RoomStatus.BOOKED);
		reservationRepository.save(reservation);
		roomRepository.save(room);
		return reservation;
	}

	@Secured(UserRole.ADMINISTRATOR)		
	public static Reservation markReservationBusy(long userId, long reservationId){
		Reservation reservation = reservationRepository.findByReservationId(reservationId);
		Room room = roomRepository.findById(reservation.getRoomId());
		reservation.setStatus(ReservationStatus.PAID);
		room.setStatus(RoomStatus.BUSY);
		reservationRepository.save(reservation);
		roomRepository.save(room);
		return reservation;
	}
	
	@Secured(UserRole.ADMINISTRATOR)		
	public static Reservation cancelReservation(long userId, long reservationId){
		Reservation reservation = reservationRepository.findByReservationId(reservationId);
		Room room = roomRepository.findById(reservation.getRoomId());
		reservation.setStatus(ReservationStatus.CANCELLED);
		room.setStatus(RoomStatus.AVAILABLE);
		reservationRepository.save(reservation);
		roomRepository.save(room);
		return reservation;
	}
	
	public static List <Reservation> findReservationsByUserId (long userId){
		List<Reservation> reservationList = reservationRepository.findByUserId(userId);
		return reservationList;
	}
	
	public static List<Reservation> findReservationsByReservationStatus (ReservationStatus status){
		List<Reservation> reservationList = reservationRepository.findAllByStatus(status);
		return reservationList;
	}
	
	public static List<Reservation> findAllReservations (long userId){
		List<Reservation> reservationList = reservationRepository.findAll();
	}

	
}
