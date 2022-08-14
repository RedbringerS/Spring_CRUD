package com.example.springcrud.service;

import com.example.springcrud.entity.Book;
import com.example.springcrud.repository.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    private final BookRepo bookRepo;

    @Autowired
    public BookService(BookRepo bookRepo) {
        this.bookRepo = bookRepo;
    }

    public Book findById(Long id){
        return bookRepo.getOne(id);
    }

    public List<Book> findAll() {
        return bookRepo.findAll();
    }
}