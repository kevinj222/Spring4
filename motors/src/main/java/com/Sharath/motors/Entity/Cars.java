package com.Sharath.motors.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Cars
{
    @Id
    private int carid;
    private String carname;
    private String brand;
    private int price;
    private String color;
    private int seat;
    private String availdate;
    private String status;
}
