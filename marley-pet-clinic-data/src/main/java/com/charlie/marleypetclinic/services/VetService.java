package com.charlie.marleypetclinic.services;

import com.charlie.marleypetclinic.models.Vet;

import java.util.Set;

public interface VetService {

    Vet findById(Long id);
    Vet save(Vet vet);
    Set<Vet> findAll();
}
