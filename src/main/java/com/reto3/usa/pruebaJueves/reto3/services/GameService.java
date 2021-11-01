
package com.reto3.usa.pruebaJueves.reto3.services;

import com.reto3.usa.pruebaJueves.reto3.entity.Game;
import com.reto3.usa.pruebaJueves.reto3.repository.GameRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class GameService {
    @Autowired
    private GameRepository repositorio;
    
    //CRUD Create, Read, Update, Delete
    //create
    public Game saveGame(Game game){
        return repositorio.save(game);
    }
    
    //read
    public List<Game> GamesGetrAll(){
        return repositorio.findAll();
    }
    //Update 
    /**public Game updateGame(Game juego){
        Game existeJuego=repositorio.findById(juego.getId()).orElse(null);
        existeJuego.setDeveloper(juego.getDeveloper());
        existeJuego.setMinage(juego.getMinage());
        existeJuego.setCategory_id(juego.getCategory_id());
        existeJuego.setName(juego.getName());
        return repositorio.save(existeJuego);
    }
    //Delete
    public String deleteGame(Game juego){
        repositorio.deleteById(juego.getId());
        return "registro con id "+juego.getId()+" ha sido eliminado";
    
    * */
}