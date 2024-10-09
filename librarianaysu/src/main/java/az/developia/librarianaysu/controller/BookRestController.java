package az.developia.librarianaysu.controller;

import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import az.developia.librarianaysu.exception.OurException;
import az.developia.librarianaysu.request.BookAddRequestDTO;
import az.developia.librarianaysu.request.BookUpdateRequestDTO;
import az.developia.librarianaysu.response.BookListResponseDTO;
import az.developia.librarianaysu.response.BookResponseDTO;
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
		if (br.hasErrors()) {
			throw new OurException("the information isn't complete","",br);
		}
		
		service.add(req);
	}
	
	@PutMapping
	public void update(@Valid @RequestBody BookUpdateRequestDTO req, BindingResult br) {
		if (br.hasErrors()) {
			throw new OurException("the information isn't complete","",br);
		}
		
		service.update(req);
	}

	@DeleteMapping(path="/{id}")
	public void delete(@PathVariable Long id) {
		
		
		service.deleteById(id);
	}
	
	@GetMapping(path="/{id}")
	public BookResponseDTO findById(@PathVariable Long id) {
		
		
		return service.findById(id);
	}
	
	@GetMapping
	public BookListResponseDTO findAll() {
		
		
		return service.findAll();
	}

}
