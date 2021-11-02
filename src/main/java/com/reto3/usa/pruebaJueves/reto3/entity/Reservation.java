package com.reto3.usa.pruebaJueves.reto3.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.Calendar;
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "reservation")
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private Date startDate;
    private Date devolutionDate;
    //private Calendar devolutionDate;
    private String status = "created";
    private String score=null;
    
    @ManyToOne
    @JoinColumn(name = "idgame")
    @JsonIgnoreProperties("reservations")      
    private Game game;     
    
    @ManyToOne     
    @JoinColumn(name = "idclient")    
    @JsonIgnoreProperties({"reservations","messages"})    
    private Client client;
     
    

    }