package az.developia.librarianaysu.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import az.developia.librarianaysu.entity.OrderEntity;

public interface OrderRepository extends JpaRepository<OrderEntity, Long> {

}
