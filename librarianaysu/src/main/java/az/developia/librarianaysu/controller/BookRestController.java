package az.developia.librarianaysu.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import az.developia.librarianaysu.service.BookService;

@RestController
@RequestMapping("/books")

public class BookRestController {
	private BookService service;

}
