package com.roman.portier.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "work_card")
public class WorkCard {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    private String url;

    private String url2;

    private String url3;

    public WorkCard() {
    }

    public WorkCard(int id, String name, String url, String url2, String url3) {
        this.id = id;
        this.name = name;
        this.url = url;
        this.url2 = url2;
        this.url3 = url3;
    }


    public WorkCard(String name, String url, String url2, String url3) {
        this.name = name;
        this.url = url;
        this.url2 = url2;
        this.url3 = url3;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUrl2() {
        return url2;
    }

    public void setUrl2(String url2) {
        this.url2 = url2;
    }

    public String getUrl3() {
        return url3;
    }

    public void setUrl3(String url3) {
        this.url3 = url3;
    }

    @Override
    public String toString() {
        return "WorkCard{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", url='" + url + '\'' +
                ", url2='" + url2 + '\'' +
                ", url3='" + url3 + '\'' +
                '}';
    }
}
