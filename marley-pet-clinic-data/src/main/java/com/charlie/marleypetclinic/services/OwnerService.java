package com.charlie.marleypetclinic.services;

import com.charlie.marleypetclinic.models.Owner;

public interface OwnerService extends CrudService <Owner, Long> {

    Owner findByLastName(String lastName);
}
