package ua.com.company.product.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.com.company.product.dto.products.ProductDTO;
import ua.com.company.product.model.Product;
import ua.com.company.product.model.User;
import ua.com.company.product.repository.ProductRepository;
import ua.com.company.product.repository.UserRepository;
import ua.com.company.product.service.ProductService;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<ProductDTO> findAll() {
        return productRepository.findProducts();
    }

    @Override
    public String pay(long userId, long id) {
        final User user = userRepository.findById(userId)
                .orElseThrow(() -> new RuntimeException("User not found"));
        final Product product = productRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Product not found"));
        if (user.getBalance() < product.getPrice()) {
            return "Not enough money";
        }
        final double balance = user.getBalance() - product.getPrice();
        user.setBalance(balance);
        userRepository.saveAndFlush(user);
        return "paid";
    }
}
