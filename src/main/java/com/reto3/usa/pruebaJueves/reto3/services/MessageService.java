

package com.reto3.usa.pruebaJueves.reto3.services;


import com.reto3.usa.pruebaJueves.reto3.entity.Message;
import com.reto3.usa.pruebaJueves.reto3.repository.MessageRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessageService {

   @Autowired
    private MessageRepository repositorio;

    public Message MessageSave(Message message) {
        return repositorio.save(message);
    }
    
    public List<Message> MessageGetAll(){
          return repositorio.findAll();
    }

 }
