package fr.abbo.septArche.Services;

import fr.abbo.septArche.DAO.UserRepository;
import fr.abbo.septArche.exceptions.StockExceptions;
import fr.abbo.septArche.models.Commande;
import fr.abbo.septArche.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class UsersServices {

    @Autowired
    private UserRepository userRepository;

    @Transactional(rollbackFor = StockExceptions.class)
    public void creerUser(User user) throws StockExceptions {
        userRepository.save(user);
    }

    public ResponseEntity<List<User>> findAll() {
        return ResponseEntity.ok(userRepository.findAll());
    }
}
