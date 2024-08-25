package com.micro.client.service;

import com.micro.client.entities.Client;
import com.micro.client.repository.ClientRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientServiceImpl implements IClientService{

    @Autowired
    private ClientRepository clientRepository;


    @Override
    public List<Client> findAll() {
        return (List<Client>) clientRepository.findAll();
    }

    @Override
    public Client findById(Long id) {
        return clientRepository.findById(id).orElseThrow();
    }

    @Override
    public void save(Client client) {
        clientRepository.save(client);

    }

    @Override
    public List<Client> findByIdConcert(Long idConcert) {
        return clientRepository.findAllByConcertId(idConcert);
    }
}
