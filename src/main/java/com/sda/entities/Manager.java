package com.sda.entities;

import javax.persistence.*;

@Entity
@Table(name = "managers")
public class Manager extends Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "department_managed")
    private String departmentManaged;



}
