package az.developia.librarianaysu.controller;

import org.springframework.http.HttpStatus;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import az.developia.librarianaysu.exception.OurException;
import az.developia.librarianaysu.request.BookAddRequestDTO;
import az.developia.librarianaysu.request.BookUpdateNameRequestDTO;
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
	@ResponseStatus(code = HttpStatus.CREATED)
	public void add(@Valid @RequestBody BookAddRequestDTO req, BindingResult br) {
		if (br.hasErrors()) {
			throw new OurException("the information isn't complete", "", br);
		}

		service.add(req);
	}

	@PutMapping
	@ResponseStatus(code = HttpStatus.OK)
	public void update(@Valid @RequestBody BookUpdateRequestDTO req, BindingResult br) {
		if (br.hasErrors()) {
			throw new OurException("the information isn't complete", "", br);
		}

		service.update(req);
	}

	@DeleteMapping(path = "/{id}")
	@ResponseStatus(code = HttpStatus.OK)
	public void delete(@PathVariable Long id) {

		service.deleteById(id);
	}

	@GetMapping(path = "/{id}")
	public BookResponseDTO findById(@PathVariable Long id) {

		return service.findById(id);
	}

	@GetMapping
	public BookListResponseDTO findAll() {

		return service.findAll();
	}

	@PatchMapping
	public void updateName(@Valid @RequestBody BookUpdateNameRequestDTO req, BindingResult br) {
		
		if (br.hasErrors()) {
			throw new OurException("the information isn't complete", "", br);
		}

		service.updateName(req);
	}

	@GetMapping(path="/pagination/begin/{begin}/length/{length}")
	public BookListResponseDTO findAllPagination(@PathVariable Integer begin, @PathVariable Integer length) {

		return service.findAllPagination(begin, length);
	}
	
	@GetMapping(path = "/name-search/{name}")
	public BookListResponseDTO findByName(@PathVariable String name) {

		return service.findByName(name);
	}

}
