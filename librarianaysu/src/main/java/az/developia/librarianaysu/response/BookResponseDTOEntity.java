package az.developia.librarianaysu.response;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BookResponseDTOEntity {

	private Long id;

	private String name;

	private String author;

	private LocalDate publishDate;
}
