package com.example.demo.fallback;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

import com.example.demo.domain.Book;
import com.example.demo.proxy.BookServiceProxy;
@Component
public class BookServiceFallback  implements BookServiceProxy {

	@Override
	public List<Book> getAllBooks() {
		// TODO Auto-generated method stub
		return Arrays.asList(new Book());
	}

	@Override
	public Book getBookById(Integer id) {
		// TODO Auto-generated method stub
		return new Book(id,"abdul","asam",44444);
	}

}
