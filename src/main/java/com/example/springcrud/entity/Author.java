package com.example.springcrud.entity;

import javax.persistence.*;

@Entity
@Table(name = "authors")
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "author_id")
    private Long autrhorId;

    @Column(name = "name")
    private String name;

    public Long getAutrhorId() {
        return autrhorId;
    }

    public void setAutrhorId(Long autrhorId) {
        this.autrhorId = autrhorId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}