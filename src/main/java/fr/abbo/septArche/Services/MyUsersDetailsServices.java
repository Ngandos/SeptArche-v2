package fr.abbo.septArche.Services;

import fr.abbo.septArche.DAO.UserRepository;
import fr.abbo.septArche.models.MyUsersDetails;
import fr.abbo.septArche.models.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MyUsersDetailsServices implements UserDetailsService {

    @Autowired
    UserRepository userRepository;

    @Override
    public MyUsersDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        Optional<Users> users = userRepository.findByUsername(userName);

        users.orElseThrow(() -> new UsernameNotFoundException("Not Found: " + userName));

        return users.map(MyUsersDetails::new).get();
    }
}
