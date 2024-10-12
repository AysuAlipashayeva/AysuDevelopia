package az.developia.librarianaysu.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import az.developia.librarianaysu.entity.BookEntity;


public interface BookRepository extends JpaRepository<BookEntity, Long> {

	@Query(value ="select * from books limit ?1, ?2", nativeQuery = true)
	List<BookEntity> findAllPagination(Integer begin, Integer length);

}
