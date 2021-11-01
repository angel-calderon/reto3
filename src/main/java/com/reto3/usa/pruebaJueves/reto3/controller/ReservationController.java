
package com.reto3.usa.pruebaJueves.reto3.controller;

import com.reto3.usa.pruebaJueves.reto3.entity.Reservation;
import com.reto3.usa.pruebaJueves.reto3.services.ReservationService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

 @RestController
 @RequestMapping("/api/Reservation")
public class ReservationController {

        @Autowired
        private ReservationService servicio;

        @GetMapping("/all")
        public List<Reservation> reservationFindAll() {
            return servicio.ReservationGetAll();
        }

        @PostMapping("/save")
        public ResponseEntity reservationAdd(@RequestBody Reservation reservation) {
            servicio.ReservationSave(reservation);
            return ResponseEntity.status(201).build();
        }
    
 }
