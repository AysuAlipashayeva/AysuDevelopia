package az.developia.librarianaysu.service;

import az.developia.librarianaysu.request.BookAddRequestDTO;
import az.developia.librarianaysu.request.BookUpdateNameRequestDTO;
import az.developia.librarianaysu.request.BookUpdateRequestDTO;
import az.developia.librarianaysu.response.BookListResponseDTO;
import az.developia.librarianaysu.response.BookResponseDTO;

public interface BookService {
	void add(BookAddRequestDTO req);
	
	BookListResponseDTO findAll();
	
	BookResponseDTO findById(Long id);
	
	void deleteById(Long id);
	
	void update( BookUpdateRequestDTO req);
	
	void updateName( BookUpdateNameRequestDTO req);

}
