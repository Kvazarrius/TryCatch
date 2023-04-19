package general.controllers;

import general.dto.User;
import general.service.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
public class TryController {
    UserRepository userRepository;

    @RequestMapping("/")
    public String hi() {
        return "TryCatch will be available soon... (no)";
    }

    @PostMapping("/addUser")
    public String addUser(@RequestParam String name, @RequestParam String email) {
        User user = new User();
        user.setName(name);
        user.setEmail(email);
        userRepository.save(user);
        return "User add!";
    }

    @GetMapping("/getAllUsers")
    public Iterable<User> getAllUsers() {
        return userRepository.findAll();
    }
}
