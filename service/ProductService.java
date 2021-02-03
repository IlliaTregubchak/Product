package ua.com.company.product.service;

import ua.com.company.product.dto.products.ProductDTO;

import java.util.List;

public interface ProductService {

    List<ProductDTO> findAll();

    String pay(long userId, long id);
}
