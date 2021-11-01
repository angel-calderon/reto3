/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.reto3.usa.pruebaJueves.reto3.services;

import com.reto3.usa.pruebaJueves.reto3.entity.Reservation;
import com.reto3.usa.pruebaJueves.reto3.entity.Score;
import com.reto3.usa.pruebaJueves.reto3.repository.ScoreRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Angel
 */
@Service
public class ScoreService {
    @Autowired
    private ScoreRepository repositorio;

    public Score ScoreSave(Score score) {
        return repositorio.save(score);
    }
    
    public List<Score> ScoreGetAll(){
        return repositorio.findAll();
    }
}
