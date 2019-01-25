package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.service.BookService;

@Controller
@RequestMapping("/index/list")
public class BookController {

	@Autowired
	BookService bookService;

	@RequestMapping(value = "/books")
	public String getBooks(Model model) {
		model.addAttribute("books", bookService.getBooks());
		return "/books.jsp";
	}

	@RequestMapping(value = "/books/{id}")
	public String getBookById(@PathVariable("id") int id, Model model) {
		System.out.println("inside getbyid");
		model.addAttribute("book", bookService.getBookById(id));
		return "/book.jsp";
	}
}
