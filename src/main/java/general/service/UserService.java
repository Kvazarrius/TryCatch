package general.service;

import general.dto.UserDTO;

public interface UserService {
    void addUser(int id, String name);

    UserDTO getUser(int id);
}
