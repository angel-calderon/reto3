
package com.reto3.usa.pruebaJueves.reto3.services;

import com.reto3.usa.pruebaJueves.reto3.entity.Reservation;
import com.reto3.usa.pruebaJueves.reto3.repository.ReservationRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReservationService {
    @Autowired
    private ReservationRepository repositorio;

    public Reservation ReservationSave(Reservation reservation) {
        return repositorio.save(reservation);
    }
    
    public List<Reservation> ReservationGetAll(){
        return repositorio.findAll();
}
}
