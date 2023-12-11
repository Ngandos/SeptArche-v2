package fr.abbo.septArche.controllers;

import fr.abbo.septArche.Services.AuthServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class AuthController {

    @Autowired
    private AuthServices authServices;

    @PostMapping("/connect")
    public ResponseEntity<Map<String, String>> login(@RequestBody Map<String, String> credentials) {
        String username = credentials.get("username");
        String password = credentials.get("password");

        // Validate the username and password (you may use a service for this)
        boolean isValid = authServices.authenticate(username, password);

        if (isValid) {
            // Generate a token (you may use JWT or other authentication mechanisms)
            String token = authServices.generateToken(username);

            // Return the token in the response
            Map<String, String> response = new HashMap<>();
            response.put("token", token);

            return ResponseEntity.ok(response);
        } else {
            // Return an error response if authentication fails
            Map<String, String> response = new HashMap<>();
            response.put("error", "Invalid credentials");

            return ResponseEntity.status(401).body(response);
        }
    }

}
