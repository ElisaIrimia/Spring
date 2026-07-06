package com.example.tema14.controller;

import com.example.tema14.model.Book;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class BookController {

    @GetMapping("/books")
    public String books(Model model){

        List<Book> books = new ArrayList<>();

        books.add(new Book(1,"Java","Blandiana",657));
        books.add(new Book(2,"Spring","Marian",364));
        books.add(new Book(3,"SQL","Filip",120));

        model.addAttribute("books", books);

        return "books";
    }

    @GetMapping("/author/{name}")
    public String author(@PathVariable String name, Model model){

        model.addAttribute("author", name);

        return "author";
    }

}