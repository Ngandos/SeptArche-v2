package fr.abbo.septArche.Services;

import fr.abbo.septArche.DAO.UserRepository;
import fr.abbo.septArche.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class UsersServices {

    @Autowired
    private UserRepository userRepository;

    @PostMapping("user")
    User newUser(@RequestBody User newUser) {
        return userRepository.save(newUser);
    }
}
