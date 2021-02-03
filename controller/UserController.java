package ua.com.company.product.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ua.com.company.product.dto.users.SaveUserDTO;
import ua.com.company.product.model.User;
import ua.com.company.product.service.UserService;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/create_user")
    public ResponseEntity<User> save(@RequestBody SaveUserDTO saveUserDTO) {
        final User saveUser = userService.save(saveUserDTO);
        return new ResponseEntity<>(saveUser, HttpStatus.OK);
    }

    @PutMapping("/add_money")
    public ResponseEntity<Double> addMoney(@RequestParam long id, @RequestParam double amount) {
        final double balance = userService.addMoney(id, amount);
        return new ResponseEntity<>(balance, HttpStatus.OK);
    }
}
