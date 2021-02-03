package ua.com.company.product.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import ua.com.company.product.dto.products.ProductDTO;
import ua.com.company.product.model.Product;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
    @Query("select new ua.com.company.product.dto.products.ProductDTO(p.id, c.name, p.name, p.price) from Product p, Category c where p.categoryId = c.id")
    List<ProductDTO> findProducts();
}
