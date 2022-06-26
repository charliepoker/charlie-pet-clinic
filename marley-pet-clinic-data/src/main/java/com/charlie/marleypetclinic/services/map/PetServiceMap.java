package com.charlie.marleypetclinic.services.map;

import com.charlie.marleypetclinic.models.Pet;
import com.charlie.marleypetclinic.services.CrudService;

import java.util.Set;

public class PetServiceMap extends AbstractMapService <Pet, Long> implements CrudService<Pet, Long> {


    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Pet save(Pet object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void delete(Pet object) {

    }

    @Override
    public void deleteById(Long id) {

    }





}
