package ua.com.company.product.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ua.com.company.product.dto.products.ProductDTO;
import ua.com.company.product.service.ProductService;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/list")
    public ResponseEntity<List<ProductDTO>> findAll() {
        final List<ProductDTO> products = productService.findAll();
        return new ResponseEntity<>(products, HttpStatus.OK);
    }

    @PostMapping("/pay")
    public ResponseEntity<String> pay(@RequestParam long userId, @RequestParam long id) {
        final String pay = productService.pay(userId, id);
        return new ResponseEntity<>(pay, HttpStatus.OK);
    }

}
