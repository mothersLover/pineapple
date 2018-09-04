package com.pineapple.core.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Version;

@Data
@Entity
public class User {

    private @Id @GeneratedValue Long id;
    private String name;
    private String description;

    private @Version @JsonIgnore Long version;

    private User(){}

    public User(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public Long getId() {
        return id;
    }
}
