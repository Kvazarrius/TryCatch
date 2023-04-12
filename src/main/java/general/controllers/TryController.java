package general.controllers;

import general.controllers.dto.UserDTO;
import org.springframework.web.bind.annotation.*;
import general.controllers.service.UserService;

@RestController
public class TryController {

    UserService userService;

    @RequestMapping("/hi")
    public String hi() {
        return "TryCatch will be available soon... (no)";
    }
    @PostMapping("/addUser")
    public void addUser(@RequestParam int id, @RequestParam String name) {
        userService.addUser(id, name);
    }

    @GetMapping("/getUser")
    public UserDTO getUser(@RequestParam int id) {
        return userService.getUser(id);
    }

}
