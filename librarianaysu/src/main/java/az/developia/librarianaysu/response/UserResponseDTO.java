package az.developia.librarianaysu.response;

import az.developia.librarianaysu.entity.UserEntity;
import lombok.Data;

@Data
public class UserResponseDTO {
	private UserEntity user;
}
