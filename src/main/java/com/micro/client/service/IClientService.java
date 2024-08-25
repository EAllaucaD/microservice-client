package com.micro.client.service;

import com.micro.client.entities.Client;
import java.util.List;

public interface IClientService {

    List<Client> findAll();
    Client findById(Long id);
    void save(Client client);

    List<Client> findByIdConcert(Long idConcert);
}
