package general.controllers.service.impl;

import general.controllers.dto.UserDTO;
import org.springframework.stereotype.Service;
import general.controllers.service.UserService;

import java.util.HashMap;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {
    private Map<Integer, UserDTO> usersTemp = new HashMap<>();

    @Override
    public void addUser(int id, String name) {
        usersTemp.put(id, new UserDTO(id, name));
    }

    @Override
    public UserDTO getUser(int id) {
        return usersTemp.get(id);
    }
}
