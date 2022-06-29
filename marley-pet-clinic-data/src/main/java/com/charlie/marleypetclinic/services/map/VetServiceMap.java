package com.charlie.marleypetclinic.services.map;

import com.charlie.marleypetclinic.models.Vet;
import com.charlie.marleypetclinic.services.CrudService;
import com.charlie.marleypetclinic.services.VetService;
import org.springframework.stereotype.Service;

import java.util.Set;


@Service
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {
    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Vet save(Vet object) {
        return super.save(object.getId(),object);
    }

    @Override
    public void delete(Vet object) {

    }

    @Override
    public void deleteById(Long id) {

    }



}
