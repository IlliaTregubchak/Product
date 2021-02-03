package ua.com.company.product.model;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;

@Getter
@Setter
@Table(name = "product_discounts")
@Entity
public class Discount {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "value")
    private double value;
    @Column(name = "product_id")
    private long productId;
}
