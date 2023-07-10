package org.aptech.t2109e.springdemo.module;


import javax.persistence.*;
import java.awt.*;

import static com.fasterxml.jackson.databind.cfg.CoercionInputShape.Array;

@Entity
@Table(name = "employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "wage")
    private String wage;

    public Employee(){

    }

    public Employee (long id, String name, String address){
        this.id = id;
        this.name = name;
        this.wage = getWage();
    }
    public long getId(){
        return id;
    }

    public void setId(long id){
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getWage(){
        return wage;
    }

    public void setWage(String wage){
        this.wage = wage;
    }

}
