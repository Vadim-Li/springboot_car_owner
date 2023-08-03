package com.vlgu.service.impl;

import com.vlgu.bean.Owner;
import com.vlgu.mapper.OwnerMapper;
import com.vlgu.service.OwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OwnerServiceImpl implements OwnerService {

    @Autowired
    private OwnerMapper ownerMapper;

    @Override
    public List<Owner> getAllOwner() {
        return ownerMapper.getAllOwner();
    }

    @Override
    public Owner getOwnerById(Integer id) {
        Owner owner = ownerMapper.getOwnerById(id);
        return owner;
    }

    @Override
    public boolean removeOwnerById(Integer id) {
        int i = ownerMapper.removeOwnerById(id);
        if(i>0){
            return true;
        }
        return false;
    }

    @Override
    public boolean save(Owner owner) {
        int i = ownerMapper.saveOwner(owner);
        if(i>0){
            return true;
        }
        return false;
    }

    @Override
    public boolean updateOwnerById(Owner owner) {
        int i = ownerMapper.updateOwner(owner);
        if(i>0){
            return true;
        }
        return false;
    }
}
