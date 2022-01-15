package fjaviermelero.springframework.sfgpetclinic.services;

import fjaviermelero.springframework.sfgpetclinic.model.*;

import java.util.Set;

public interface VetService {

    Vet findByID(Long id);

    Vet save (Vet vet);

    Set<Vet> findAll();

}
