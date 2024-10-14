package az.developia.librarianaysu.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import az.developia.librarianaysu.repository.UserRepository;
import az.developia.librarianaysu.repository.UserViewRepository;
import az.developia.librarianaysu.response.UserResponseDTO;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserRestController {
	
	private final UserRepository repository;
	private final UserViewRepository viewRepository;
	
	@GetMapping(path="/{id}")
	
	public UserResponseDTO findById (@PathVariable Long id) {
		UserResponseDTO resp = new UserResponseDTO();
		resp.setUser(repository.findById(id).get());
		System.out.println(viewRepository.findAll());
		return resp;
	}
	

}
