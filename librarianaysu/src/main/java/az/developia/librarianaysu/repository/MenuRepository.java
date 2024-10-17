package az.developia.librarianaysu.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import az.developia.librarianaysu.entity.MenuEntity;

public interface MenuRepository extends JpaRepository<MenuEntity, Long> {
	List<MenuEntity> findAllByLang(String lang);

}
