package com.micro.client.repository;

import com.micro.client.entities.Client;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;


import java.util.List;

@Repository
public interface ClientRepository extends CrudRepository<Client, Long> {

    //@Query("SELECT c FROM Client c WHERE c.concertId = :idConcert")
    //ist<Client> findAllClient(Long idConcert);

    List<Client> findAllByConcertId(Long idConcert);
}
