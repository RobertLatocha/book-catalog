package com.github.robertlatocha.bookcatalog.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import com.github.robertlatocha.bookcatalog.dto.AddBookFormDTO;
import com.github.robertlatocha.bookcatalog.dto.UpdateBookFormDTO;
import com.github.robertlatocha.bookcatalog.model.Book;
import com.github.robertlatocha.bookcatalog.service.BookService;

@Controller
public class BookController {

	@Autowired
	private BookService bookService;
	
	@GetMapping("/books")
	public String showAllBooks(Model model) {
		model.addAttribute("listBooks", bookService.getAllBooks());
		return "books";
	}	
	
	@RequestMapping("book/delete/{id}")
    public String deleteBook(@PathVariable("id") Long id){
		bookService.deleteBook(id);
        return "redirect:/books";
    }
		
	@GetMapping("/addbook")
	public String showAddBookForm(Model model, Book book) {
		model.addAttribute("book", new Book());
		
		return "addbook";
	}
	
	@PostMapping("/addbook")
	public String addBook(@ModelAttribute("addForm") @Valid AddBookFormDTO addForm, BindingResult result, Book book ) {
		if (result.hasErrors()) { 
			return "addbook";
		} else {
			bookService.addBook(book);
			return "redirect:/books";
		}
				
	}
	
	@GetMapping("book/edit/{id}")
    public String showEditBookForm(@PathVariable("id") Long id, Model model){
		model.addAttribute("book", bookService.getBookById(id));
        return "updatebook";
    }
     
    @PostMapping("book/edit/{id}")
	public String editBook(Model model, @PathVariable("id") Long id, @ModelAttribute @Valid UpdateBookFormDTO updateForm, BindingResult result, Book book) {
    	if(result.hasErrors()) {
			return "updatebook";
		} else {
    	   	bookService.updateBook(id, book);
			return "redirect:/books";
		}
    }
}
