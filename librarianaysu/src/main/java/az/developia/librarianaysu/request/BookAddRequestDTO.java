package az.developia.librarianaysu.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class BookAddRequestDTO {
	
	@NotNull(message="name is important")
	@NotBlank(message="name can't be blank")
	private String name;

	private Double price;

	private Integer pageCount;

	private String author;

}
