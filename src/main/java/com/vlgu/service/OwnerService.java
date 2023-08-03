package com.vlgu.service;

import com.vlgu.bean.Owner;

import java.util.List;

public interface OwnerService {
    List<Owner> getAllOwner();

    Owner getOwnerById(Integer id);

    boolean removeOwnerById(Integer id);

    boolean save(Owner owner);

    boolean updateOwnerById(Owner owner);


}
