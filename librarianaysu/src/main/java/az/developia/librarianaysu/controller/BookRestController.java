package az.developia.librarianaysu.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import az.developia.librarianaysu.request.BookAddRequestDTO;
import az.developia.librarianaysu.service.BookService;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/books")
@RequiredArgsConstructor
public class BookRestController {
	private final BookService service;
	
	@PostMapping
	public void add(@RequestBody BookAddRequestDTO req) {
		service.add(req);
	}

}
