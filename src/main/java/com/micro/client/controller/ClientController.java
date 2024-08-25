package com.micro.client.controller;

import com.micro.client.entities.Client;
import com.micro.client.service.IClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/client")
public class ClientController {

    @Autowired
    private IClientService clientService;

    @PatchMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public void saveClient(@RequestBody Client client){
        clientService.save(client);
    }


    @GetMapping("/all")
    public ResponseEntity<?> findAllClient(){
        return ResponseEntity.ok(clientService.findAll());
    }


    @GetMapping("/search/{id}")
    public ResponseEntity<?> findById(@PathVariable Long id){
        return ResponseEntity.ok(clientService.findById(id));
    }


    //Endpoint
    @GetMapping("/search-my-concert/{idConcert}")
    public ResponseEntity<?> findByIdConcert(@PathVariable Long idConcert){
        return ResponseEntity.ok(clientService.findByIdConcert(idConcert));
    }
}
