package ua.com.company.product.service;

import ua.com.company.product.dto.users.SaveUserDTO;
import ua.com.company.product.model.User;

public interface UserService {

    User save(SaveUserDTO saveUserDTO);

    double addMoney(long id, double amount);
}
