package fr.diginamic.tp_grasps;

import java.time.LocalDateTime;

import fr.diginamic.tp_grasps.beans.Client;
import fr.diginamic.tp_grasps.beans.Reservation;
import fr.diginamic.tp_grasps.beans.TypeReservation;
import fr.diginamic.tp_grasps.daos.ClientDao;
import fr.diginamic.tp_grasps.daos.TypeReservationDao;
import utils.CalculTotalUtil;
import utils.DateUtil;

public class ReservationFactory {

    public static Reservation creerReservation(String identifiantClient, String dateReservationStr, 
                                               String typeReservation, int nbPlaces, 
                                               ClientDao clientDao, TypeReservationDao typeReservationDao) {
        
        // Conversion de la date de réservation en LocalDateTime
        LocalDateTime dateReservation = DateUtil.toDate(dateReservationStr);
        
        // Extraction des informations client
        Client client = clientDao.extraireClient(identifiantClient);
        
        // Extraction des informations concernant le type de la réservation
        TypeReservation type = typeReservationDao.extraireTypeReservation(typeReservation);
        
        // Création de la réservation
        Reservation reservation = new Reservation(dateReservation);
        reservation.setNbPlaces(nbPlaces);
        reservation.setClient(client);
        
        // Ajout de la réservation au client
        client.getReservations().add(reservation);
        
        // Calcul du montant total de la réservation
        double total = CalculTotalUtil.calculerTotal(type.getMontant(), nbPlaces, client.isPremium(), type.getReductionPourcent());
        reservation.setTotal(total);
        
        return reservation;
    }
}

