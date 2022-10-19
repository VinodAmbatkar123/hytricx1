package com.example.demo.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.Book;
import com.example.demo.proxy.BookServiceProxy;
@RestController
public class BookConsumerController {
	@Autowired
	BookServiceProxy bookServiceProxy;
	
	@GetMapping("/get-books")
	public List<Book> getAllBooks(){
		return bookServiceProxy.getAllBooks();
	}
	
	
	@GetMapping( value= "/get-book/{id}",produces = {MediaType.APPLICATION_JSON_VALUE})
	public Book getBookById( @PathVariable ("id")int id) {
		Book book= bookServiceProxy.getBookById(id);
		return book;
	}

}
