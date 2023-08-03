package com.vlgu.bean;

import lombok.Data;

import java.util.Date;

@Data
public class Car {
    private Integer carId;
    private String number;
    private String yearOfRelease;
    private String brand;
    private String model;
}
