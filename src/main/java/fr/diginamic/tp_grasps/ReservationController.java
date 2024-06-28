package fr.diginamic.tp_grasps;


import fr.diginamic.tp_grasps.beans.Reservation;
import fr.diginamic.tp_grasps.daos.ClientDao;
import fr.diginamic.tp_grasps.daos.TypeReservationDao;



/**
 * Controlleur qui prend en charge la gestion des réservations client
 * 
 * @author RichardBONNAMY
 *
 */
public class ReservationController {

    private ClientDao clientDao = new ClientDao();
    private TypeReservationDao typeReservationDao = new TypeReservationDao();

    public Reservation creerReservation(Params params) {
        
        String identifiantClient = params.getIdentifiantClient();
        String dateReservationStr = params.getDateReservation();
        String typeReservation = params.getTypeReservation();
        int nbPlaces = params.getNbPlaces();
        
        Reservation reservation = ReservationFactory.creerReservation(
            identifiantClient, 
            dateReservationStr, 
            typeReservation, 
            nbPlaces, 
            clientDao, 
            typeReservationDao
        );

        return reservation;
    }
}

