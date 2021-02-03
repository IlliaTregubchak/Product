package ua.com.company.product.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.com.company.product.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
