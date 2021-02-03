package ua.com.company.product.dto.users;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SaveUserDTO {
    private String name;
    private int phoneNumber;
    private String email;
}
