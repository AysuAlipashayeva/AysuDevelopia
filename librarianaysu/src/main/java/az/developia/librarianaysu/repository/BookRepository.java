package az.developia.librarianaysu.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import az.developia.librarianaysu.entity.BookEntity;

public interface BookRepository extends JpaRepository<BookEntity, Long> {

	@Query(value = "select * from books limit ?1, ?2", nativeQuery = true)
	List<BookEntity> findAllPagination(Integer begin, Integer length);

	@Query(value = "select count (*) from books ", nativeQuery = true)
	Integer findAllCount();

	@Query(value = "select * from books where name like %?1%", nativeQuery = true)
	List<BookEntity> findAllSearch(String name);

}
