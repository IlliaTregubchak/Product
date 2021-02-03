package ua.com.company.product.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.com.company.product.model.Discount;

public interface DiscountRepository extends JpaRepository<Discount, Long> {
}
