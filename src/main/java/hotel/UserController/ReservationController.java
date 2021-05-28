package hotel.Controller;

import java.util.Date;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import hotel.Reservation;
import hotel.ReservationStatus;
import hotel.Service.ReservationService;

@RestController
public class ReservationController {
	
	void createReservation(long roomId, long UserId, double price, ReservationStatus status, Date startDate){
		ReservationService.createReservation(roomId, UserId, price, status, startDate);
		
	}
	
	Reservation confirmReservation(@PathVariable long userId, @PathVariable long reservationId){
		Reservation reservation = ReservationService.confirmReservation(userId, reservationId);
		return reservation;
	}
	
	Reservation markReservationBusy(@PathVariable long userId, @PathVariable long reservationId){
		Reservation reservation = ReservationService.markReservationBusy(userId, reservationId);
		return reservation;
	}
	
	Reservation cancelReservation(@PathVariable long userId, @PathVariable long reservationId){
		Reservation reservation = ReservationService.cancelReservation(userId, reservationId);
		return reservation;
	}
	
	List<Reservation> findReservationsByUserId (@PathVariable long userId){
		List<Reservation> reservationList = ReservationService.findReservationsByUserId(userId);
		return reservationList;
	}
	
	List<Reservation> findReservationsByReservationStatus (@PathVariable long userId, @PathVariable ReservationStatus status){
		List<Reservation> reservationList = ReservationService.findReservationsByReservationStatus(status);
		return reservationList;
	}
	
	List<Reservation> findAllReservations (@PathVariable long userId){
		List<Reservation> reservationList = ReservationService.findAllReservations(userId);
		return reservationList;
	}
}
