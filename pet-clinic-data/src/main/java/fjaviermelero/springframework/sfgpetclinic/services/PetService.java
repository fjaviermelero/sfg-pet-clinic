package fjaviermelero.springframework.sfgpetclinic.services;

import fjaviermelero.springframework.sfgpetclinic.model.*;

import java.util.Set;

public interface PetService {

    Pet findByID(Long id);

    Pet save (Pet pet);

    Set<Pet> findAll();
}
