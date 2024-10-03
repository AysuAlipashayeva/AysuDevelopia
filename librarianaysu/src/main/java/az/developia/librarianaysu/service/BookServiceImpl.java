package az.developia.librarianaysu.service;

import az.developia.librarianaysu.entity.BookEntity;
import az.developia.librarianaysu.repository.BookRepository;
import az.developia.librarianaysu.request.BookAddRequestDTO;
import az.developia.librarianaysu.response.BookListResponseDTO;
import az.developia.librarianaysu.response.BookResponseDTO;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class BookServiceImpl implements BookService {
	private final BookRepository repository;

	@Override
	public void add(BookAddRequestDTO req) {
		BookEntity entity = new BookEntity();
			entity.setName(req.getName());
			entity.setPrice(req.getPrice());
			entity.setPageCount(req.getPageCount());
			entity.setAuthor(req.getAuthor());
			repository.save(entity);

	}

	@Override
	public BookListResponseDTO findAll() {
		return null;
	}

	@Override
	public BookResponseDTO findById(Long id) {
		return null;
	}

	@Override
	public void deleteById(Long id) {
	}

}
