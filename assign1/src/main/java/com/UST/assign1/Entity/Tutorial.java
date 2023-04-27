package com.UST.assign1.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Tutorial")
public class Tutorial
{
    @GeneratedValue
    @Id
    @Column(name = "Id")
    private Integer Id;
    @Column(name = "Title")
    private String title;
    @Column(name = "Description")
    private String description;
}
