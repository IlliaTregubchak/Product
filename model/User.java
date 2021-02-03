package ua.com.company.product.model;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;

@Getter
@Setter
@Table(name = "users")
@Entity
public class User {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "name")
    private String name;
    @Column(name = "phone_number")
    private int phoneNumber;
    @Column(name = "email")
    private String email;
    @Column(name = "balance")
    private double balance;
}
