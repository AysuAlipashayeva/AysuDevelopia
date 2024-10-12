package az.developia.librarianaysu.request;

import java.time.LocalDate;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class BookAddRequestDTO {

	@NotNull(message = "name is important")
	@NotBlank(message = "name can't be blank")
	@Size(min = 1, max = 50, message = "name must be greater than 0 and less than 50")
	private String name;

	@Min(value = 1, message = "page count must be greater than 0")
	private Integer pageCount;

	@NotBlank(message = "author can't be blank")
	private String author;

	@Past
	private LocalDate publishDate;
}
