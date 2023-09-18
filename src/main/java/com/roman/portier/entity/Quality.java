package com.roman.portier.entity;

import jakarta.persistence.*;


@Entity
@Table(name = "quality")
public class Quality {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String title;

    private String description;

    public Quality() {
    }

    public Quality(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public Quality(int id, String title, String description) {
        this.id = id;
        this.title = title;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
