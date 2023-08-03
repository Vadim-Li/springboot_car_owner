package com.vlgu.controller;

import com.vlgu.service.OwnerService;
import com.vlgu.bean.Owner;
import com.vlgu.common.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class OwnerController {
    @Autowired
    private OwnerService ownerService;

    @GetMapping("/owner")
    public List<Owner> getAllOwner(){
        return ownerService.getAllOwner();
    }

    @GetMapping("/owner/{id}")
    public Owner getOwnerById(@PathVariable("id") Integer id){
        Owner owner = ownerService.getOwnerById(id);
        return owner;
    }

    @DeleteMapping("/owner/delete/{id}")
    public Result deleteOwnerById(@PathVariable("id") Integer id){
        return ownerService.removeOwnerById(id) ? Result.suc():Result.fail();
    }

    @PostMapping("/owner/save")
    public Result addOwner(@RequestBody Owner owner){

        return ownerService.save(owner) ? Result.suc():Result.fail();
    }

    @PutMapping("/owner/update")
    public Result updateOwner(@RequestBody Owner owner){
        return ownerService.updateOwnerById(owner) ? Result.suc():Result.fail();
    }

}
