package ua.com.company.product.dto.products;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class ProductDTO {
    private long id;
    private String category;
    private String name;
    private double price;
}
