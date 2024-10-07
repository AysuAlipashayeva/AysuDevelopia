package az.developia.librarianaysu.controller;

import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import az.developia.librarianaysu.exception.OurException;
import az.developia.librarianaysu.request.BookAddRequestDTO;
import az.developia.librarianaysu.request.BookUpdateRequestDTO;
import az.developia.librarianaysu.service.BookService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/books")
@RequiredArgsConstructor
public class BookRestController {
	
	private final BookService service;
	
	@PostMapping
	public void add(@Valid @RequestBody BookAddRequestDTO req, BindingResult br) {
		req.setAuthor(req.getAuthor().trim());
		if (br.hasErrors()) {
			throw new OurException("the information isn't complete","",br);
		}
		
		service.add(req);
	}
	
	@PutMapping
	public void update(@Valid @RequestBody BookUpdateRequestDTO req, BindingResult br) {
		req.setAuthor(req.getAuthor().trim());
		if (br.hasErrors()) {
			throw new OurException("the information isn't complete","",br);
		}
		
		service.update(req);
	}

}
