package az.developia.librarianaysu.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import az.developia.librarianaysu.entity.OrderDetailEntity;

public interface OrderDetailRepository extends JpaRepository<OrderDetailEntity, Long> {

}
