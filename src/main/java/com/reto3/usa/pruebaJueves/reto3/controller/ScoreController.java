/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.reto3.usa.pruebaJueves.reto3.controller;

import com.reto3.usa.pruebaJueves.reto3.entity.Score;
import com.reto3.usa.pruebaJueves.reto3.services.ScoreService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Angel
 */
@RestController
@RequestMapping("/api/Score")
public class ScoreController {
    @Autowired
        private ScoreService servicio;

        @GetMapping("/all")
        public List<Score> scoreFindAll() {
            return servicio.ScoreGetAll();
        }

        @PostMapping("/save")
        public ResponseEntity scoreAdd(@RequestBody Score score) {
            servicio.ScoreSave(score);
            return ResponseEntity.status(201).build();
        }
}
