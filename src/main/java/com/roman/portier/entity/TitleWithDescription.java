package com.roman.portier.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "title_with_description")
public class TitleWithDescription {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;
    private String description;

    public TitleWithDescription() {
    }

    public TitleWithDescription(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public TitleWithDescription(int id, String title, String description) {
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
