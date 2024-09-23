package az.developia.librarian_aysu.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import az.developia.librarian_aysu.model.Book;

public interface BookDAO extends JpaRepository<Book, Integer> {

}