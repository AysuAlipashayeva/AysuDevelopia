package az.developia.librarianaysu.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import az.developia.librarianaysu.entity.BookEntity;


public interface BookRepository extends JpaRepository<BookEntity, Long> {

}
