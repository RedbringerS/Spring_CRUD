package com.example.springcrud.entity;

import javax.persistence.*;

@Entity
@Table(name = "books")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long book_id;

    @Column
    private String title_book;

    @Column
    private Long author_id;

    public Book(Long book_id, String title_book, Long author_id) {
        this.book_id = book_id;
        this.title_book = title_book;
        this.author_id = author_id;
    }

    public Book() {

    }

    public Long getBook_id() {
        return book_id;
    }

    public void setBook_id(Long book_id) {
        this.book_id = book_id;
    }

    public String getTitle_book() {
        return title_book;
    }

    public void setTitle_book(String title_book) {
        this.title_book = title_book;
    }

    public Long getAuthor_id() {
        return author_id;
    }

    public void setAuthor_id(Long author_id) {
        this.author_id = author_id;
    }
}