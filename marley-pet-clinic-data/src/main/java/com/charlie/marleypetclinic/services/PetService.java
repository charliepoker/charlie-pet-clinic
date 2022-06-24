package com.charlie.marleypetclinic.services;

import com.charlie.marleypetclinic.models.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);
    Pet save(Pet pet);
    Set<Pet> findAll();
}
