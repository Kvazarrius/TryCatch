package general.controllers.service;

import general.controllers.dto.UserDTO;

public interface UserService {
    void addUser(int id, String name);

    UserDTO getUser(int id);
}
