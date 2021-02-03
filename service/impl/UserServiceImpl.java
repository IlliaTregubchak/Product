package ua.com.company.product.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;
import ua.com.company.product.dto.users.SaveUserDTO;
import ua.com.company.product.model.User;
import ua.com.company.product.repository.UserRepository;
import ua.com.company.product.service.UserService;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User save(SaveUserDTO saveUserDTO) {
        Assert.notNull(saveUserDTO, "User is null");
        final User user = new User();
        user.setName(saveUserDTO.getName());
        user.setPhoneNumber(saveUserDTO.getPhoneNumber());
        user.setEmail(saveUserDTO.getEmail());
        user.setBalance(0);
        return userRepository.save(user);
    }

    @Override
    public double addMoney(long id, double amount) {
        // дістаємо юзера із БД
        final User user = userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found"));
        // до існуючого балансу додаю те, шо пришло
        final double newBalance = user.getBalance() + amount;
        // присв юзеру його новий баланс
        user.setBalance(newBalance);
        // перезаписуємо значення
        final User updatedUser = userRepository.saveAndFlush(user);
        return updatedUser.getBalance();
    }
}
