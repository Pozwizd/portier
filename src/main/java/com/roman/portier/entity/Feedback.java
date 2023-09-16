package com.roman.portier.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "feedback")
public class Feedback {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "text")
    private String text;

    @Column(name = "author")
    private String author;

    @Column(name = "position")
    private String position;

    public Feedback() {
    }

    public Feedback(int id, String text, String author, String position) {
        this.id = id;
        this.text = text;
        this.author = author;
        this.position = position;
    }

    public Feedback(String text, String author, String position) {
        this.text = text;
        this.author = author;
        this.position = position;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
