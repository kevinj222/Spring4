package com.UST.interview.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name="Int_tab")
public class Inter
{
    @Id
    @GeneratedValue
    private long id;
    private String fname;
    private String email;
    private String phno;
    private String sk;
    private String exp;
    private String date;
    private String link;
    private String time;
    private String Hr;
}
