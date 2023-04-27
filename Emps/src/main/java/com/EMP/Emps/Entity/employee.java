package com.EMP.Emps.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="employee_tab")
@Entity
public class employee
{
    @Id
    @GeneratedValue
    private int id;
    private String empid;
    private String empname;
    private String email;
    private String desig;
    private String HR;
}
