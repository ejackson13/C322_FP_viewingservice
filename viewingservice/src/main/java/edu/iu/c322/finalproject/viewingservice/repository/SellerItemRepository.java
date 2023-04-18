package edu.iu.c322.finalproject.viewingservice.repository;

import edu.iu.c322.finalproject.viewingservice.model.SellerItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SellerItemRepository extends JpaRepository<SellerItem, Integer> {
}
