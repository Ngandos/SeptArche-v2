package fr.abbo.septArche.Services;

import org.springframework.stereotype.Service;

@Service
public class AuthServices {

    // Dummy user credentials (replace with your database lookup)
    private static final String VALID_USERNAME = "user";
    private static final String VALID_PASSWORD = "password";

    public boolean authenticate(String username, String password) {
        // Dummy authentication logic (replace with your database lookup and password hashing)
        return VALID_USERNAME.equals(username) && VALID_PASSWORD.equals(password);
    }

    public String generateToken(String username) {
        // Dummy token generation logic (replace with your JWT or other token generation logic)
        // For simplicity, we're just concatenating username and a timestamp
        return username + System.currentTimeMillis();
    }
}
