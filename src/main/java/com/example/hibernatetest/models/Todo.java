package com.example.hibernatetest.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Todo {


    @Id
    @GeneratedValue
    private long id;
    private String description;

    public Todo() {
        this.description = "";
    }

    public Todo(String description) {
        this.description = description;
    }

    public long getId() {
        return id;
    }


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
