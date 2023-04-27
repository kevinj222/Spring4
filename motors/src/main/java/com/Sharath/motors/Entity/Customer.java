package com.Sharath.motors.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer
{
    @Id
    private int uuid;
    private String custname;
    private int phno;
    private String emailid;
}
