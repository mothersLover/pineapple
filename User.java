package com.pineapple.core.entities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class User {

    private @Id @GeneratedValue Long id;
    private String name;
    private String description;

    private User(){}

    public User(String name, String description) {
        this.name = name;
        this.description = description;
    }
}
