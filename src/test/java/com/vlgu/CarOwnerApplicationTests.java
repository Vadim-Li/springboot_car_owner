package com.vlgu;
import com.vlgu.bean.Owner;
import com.vlgu.mapper.OwnerMapper;
import com.vlgu.service.OwnerService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

@SpringBootTest
class CarOwnerApplicationTests {
    @Autowired
    private OwnerService ownerService;
    @Autowired
    private OwnerMapper ownerMapper;

    @Test
    void contextLoads() {
    }

    @Test
    public void testSelectOne(){
//        Owner ownerById = ownerService.getOwnerById(1);
        Owner ownerById = ownerMapper.getOwnerById(1);
        System.out.println(ownerById);
    }

    @Test
    public void testDeleteOwner(){
        boolean b = ownerService.removeOwnerById(3);
        System.out.println(b);
    }

    @Test
    public void testInsertOwner(){

        Owner owner = new Owner();
        owner.setSurname("aaa");
        owner.setFirstName("bbb");
        owner.setBirthday("2000-11-11");
        int i = ownerMapper.saveOwner(owner);
        System.out.println(i);
    }

    @Test
    public void testUpdateOwner(){
        Owner owner = new Owner();
        owner.setOwnerId(5);
        owner.setSurname("eee");
        owner.setFirstName("asd");
        owner.setBirthday("2000-11-11");
        boolean b = ownerService.updateOwnerById(owner);
        System.out.println(b);
    }

}
