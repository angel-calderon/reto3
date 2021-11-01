
package com.reto3.usa.pruebaJueves.reto3.controller;

import com.reto3.usa.pruebaJueves.reto3.entity.Message;
import com.reto3.usa.pruebaJueves.reto3.services.MessageService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

 @RestController
 @RequestMapping("/api/Message")
public class MessageController {

        @Autowired
        private MessageService servicio;

        @GetMapping("/all")
        public List<Message> messageFindAll() {
            return servicio.MessageGetAll();
        }

        @PostMapping("/save")
        public ResponseEntity messageAdd(@RequestBody Message message) {
            servicio.MessageSave(message);
            return ResponseEntity.status(201).build();
        }
    
 }