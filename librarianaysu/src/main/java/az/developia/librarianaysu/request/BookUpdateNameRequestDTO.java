package az.developia.librarianaysu.request;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;
@Data
public class BookUpdateNameRequestDTO {
	
	@NotNull
	@Min(value=1, message ="id can be at least 1")
	private Long id;

	@NotNull(message = "name is important")
	@NotBlank(message = "name can't be blank")
	@Size(min = 1, max = 50, message = "name must be greater than 0 and less than 50")
	private String name;

}
