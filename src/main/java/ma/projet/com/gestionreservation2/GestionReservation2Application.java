package ma.projet.com.gestionreservation2;

import ma.projet.com.gestionreservation2.entities.Reservation;
import ma.projet.com.gestionreservation2.repositories.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class GestionReservation2Application {



	public static void main(String[] args) {
		SpringApplication.run(GestionReservation2Application.class, args);
	}





}
