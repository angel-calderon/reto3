package com.reto3.usa.pruebaJueves.reto3.services;

import com.reto3.usa.pruebaJueves.reto3.entity.Client;
import com.reto3.usa.pruebaJueves.reto3.repository.ClientRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientService {

    @Autowired
    private ClientRepository repositorio;

    public Client ClientSave(Client cliente) {
        return repositorio.save(cliente);
    }

    public List<Client> ClientGetAll() {
        return repositorio.findAll();
    }
}
