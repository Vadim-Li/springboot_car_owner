package com.vlgu.mapper;

import com.vlgu.bean.Owner;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OwnerMapper {
    List<Owner> getAllOwner();

    Owner getOwnerById(@Param("ownerId") Integer ownerId);


    int saveOwner(Owner owner);

    int removeOwnerById(Integer id);

    int updateOwner(Owner owner);
}
