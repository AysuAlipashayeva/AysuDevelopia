package az.developia.librarianaysu.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import az.developia.librarianaysu.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Long> {

}
