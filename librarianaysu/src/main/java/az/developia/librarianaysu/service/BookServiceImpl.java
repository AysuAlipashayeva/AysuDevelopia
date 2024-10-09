package az.developia.librarianaysu.service;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import az.developia.librarianaysu.entity.BookEntity;
import az.developia.librarianaysu.exception.OurException;
import az.developia.librarianaysu.repository.BookRepository;
import az.developia.librarianaysu.request.BookAddRequestDTO;
import az.developia.librarianaysu.request.BookUpdateRequestDTO;
import az.developia.librarianaysu.response.BookListResponseDTO;
import az.developia.librarianaysu.response.BookResponseDTO;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class BookServiceImpl implements BookService {
	private final BookRepository repository;

	private final ModelMapper mapper;

	@Override
	public void add(BookAddRequestDTO req) {

		BookEntity entity = new BookEntity();
		mapper.map(req, entity);
		repository.save(entity);

	}

	@Override
	public BookListResponseDTO findAll() {
		List<BookEntity> all = repository.findAll();
		BookListResponseDTO dto = new BookListResponseDTO();
		dto.setBooks(all);
		return dto;
	}

	@Override
	public BookResponseDTO findById(Long id) {
		BookEntity entity = repository.findById(id).orElseThrow(() -> new OurException("book not found", "", null));
		BookResponseDTO dto = new BookResponseDTO();
		mapper.map(entity, dto);
		return dto;
	}

	@Override
	public void deleteById(Long id) {
		repository.deleteById(id);
	}

	@Override
	public void update(BookUpdateRequestDTO req) {
		Long id = req.getId();
		BookEntity entity = repository.findById(id).orElseThrow(() -> new OurException("book not found", "", null));
		mapper.map(req, entity);
		repository.save(entity);

	}
}
