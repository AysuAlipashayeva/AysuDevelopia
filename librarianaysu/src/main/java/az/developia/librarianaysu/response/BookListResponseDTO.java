package az.developia.librarianaysu.response;

import java.util.List;

import az.developia.librarianaysu.entity.BookEntity;
import lombok.Data;

@Data
public class BookListResponseDTO {
	private List<BookEntity> books;

}
