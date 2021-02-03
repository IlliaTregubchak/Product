package ua.com.company.product.model;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;

@Getter
@Setter
@Table(name = "products")
@Entity
public class Product {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "category_id")
    private long categoryId;
    @Column(name = "name")
    private String name;
    @Column(name = "price")
    private double price;
}
