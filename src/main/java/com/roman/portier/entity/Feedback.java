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


    @Column(name = "url")
    private String url;

    public Feedback() {

    }

    public Feedback(String text, String author, String position, String url) {
        this.text = text;
        this.author = author;
        this.position = position;
        this.url = url;
    }

    public Feedback(int id, String text, String author, String position, String url) {
        this.id = id;
        this.text = text;
        this.author = author;
        this.position = position;
        this.url = url;
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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "Feedback{" +
                "id=" + id +
                ", text='" + text + '\'' +
                ", author='" + author + '\'' +
                ", position='" + position + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}
