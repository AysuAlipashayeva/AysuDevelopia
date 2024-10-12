package az.developia.librarianaysu.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class UserAddRequestDTO {

	@NotNull(message = "username is important")
	@NotBlank(message = "username can't be blank")
	@Size(min = 1, max = 50, message = "name must be greater than 0 and less than 50")
	private String username;

	private String password;

	@NotNull(message = "email is important")
	@NotBlank(message = "email can't be blank")
	@Pattern(regexp = "[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,3}")
	private String email;

	@NotNull(message = "role is important")
	@NotBlank(message = "role can't be blank")
	private String role;

}
