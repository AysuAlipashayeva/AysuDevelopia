package az.developia.librarian_aysu.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import az.developia.librarian_aysu.dao.BookDAO;
import az.developia.librarian_aysu.model.Book;

@Controller
public class BookController {
	@Autowired
	private BookDAO bookDAO;
	
	@GetMapping(path="/books")
	public String showBooks(Model model) {
		List<Book> books=bookDAO.findAll();
		model.addAttribute("books", books);
		return "books";
	}
	
	@GetMapping(path="/books/new")
	public String openNewBookPage(Model model) {
		Book book=new Book();
		model.addAttribute("book",book);
		model.addAttribute("header", "New book");
		return "new-book";
	}
	
	@PostMapping(path="/books/new-book-process")
	public String saveBook(@ModelAttribute(name="book") Book book,Model model) {
		book.setImage("book.jpg");
		bookDAO.save(book);
		List<Book> books=bookDAO.findAll();
		model.addAttribute("books", books);
		return "redirect:/books";
	}
	
	@GetMapping(path="/books/delete/{id}")
	public String deleteBook(@PathVariable(name="id")Integer id, Model model) {
		boolean bookExist=bookDAO.findById(id).isPresent();
		if(bookExist) {
			bookDAO.deleteById(id);
		}else {
			
		}
		List<Book> books=bookDAO.findAll();
		model.addAttribute("books", books);
		return "redirect:/books";
	}
	
	@GetMapping(path="/books/edit/{id}")
	public String editBook(@PathVariable(name="id")Integer id, Model model) {
		Optional<Book> bookOptional=bookDAO.findById(id);
		boolean bookExist=bookOptional.isPresent();
		Book book=new Book();
		if(bookExist) {
			book=bookOptional.get();
		}else {
			
		}
		model.addAttribute("book", book);
		model.addAttribute("header", "Book editing");
		return "new-book";
	}
}
