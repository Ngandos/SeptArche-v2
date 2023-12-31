package fr.abbo.septArche.controllers;

import fr.abbo.septArche.DAO.ClientsRepository;
import fr.abbo.septArche.exceptions.ClientExceptions;
import fr.abbo.septArche.models.Client;
import fr.abbo.septArche.Services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping(path = "/client")
public class ClientsController {

    @Autowired
    private ClientsRepository rep;

    @Autowired
    private ClientService clientService;

    @GetMapping()
    public List<Client> findAll() {
        return rep.findAll();
    }

    @GetMapping(params = {"username"})
    public Optional<Client> findByUsername(@RequestParam String username) {
        return rep.findByUsername(username);
    }

    @GetMapping(params = {"nom"})
    public Client findByNom(@RequestParam String nom) {
        return rep.findByNom(nom);
    }

    @GetMapping(params = {"email"})
    public Client findByEmail(@RequestParam String email) {
        return rep.findByEmail(email);
    }

    @PostMapping()
    public ResponseEntity<String> creerClient(@RequestBody Client client) {
        try {
            clientService.creerClient(client);
            return ResponseEntity.status(HttpStatus.CREATED).body("Utilisateur Enregistré");
        } catch (ClientExceptions e) {
            // Log the exception for debugging
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Erreur lors de l'enregistrement");
        }
    }

    @Autowired
    private ClientsRepository clientsRepository;

    @PostMapping("/connect")
    public ResponseEntity<String> connect(@RequestBody Map<String, String> credentials) {
        String username = credentials.get("username");
        String password = credentials.get("password");

        // Perform authentication logic

        Optional<Client> client = clientsRepository.findByUsername(username);

        if (client.isPresent() && client.get().getPassword().equals(password)) {

            // Authentication successful

            // Assuming the server sends back a JWT token in the response

            String token = "your_generated_jwt_token";

            return ResponseEntity.ok("{\"token\": \"" + token + "\"}");

        } else {

            // Authentication failed

            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid credentials");
        }
    }
}
