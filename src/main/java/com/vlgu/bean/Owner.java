package com.vlgu.bean;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class Owner {
    private Integer ownerId;
    private String surname;
    private String firstName;
    private String birthday;
    private List<Car> cars;
}
