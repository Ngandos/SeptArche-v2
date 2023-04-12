package fr.abbo.septArche.controllers;

import fr.abbo.septArche.models.Livres;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@CrossOrigin
@RestController
@RequestMapping("/livres")
public class LivresController {

    //@Autowired
    //private LivresService livresService;


    @GetMapping
    public List<Livres> getAll() {
        ArrayList<Livres> livresList = new ArrayList<>();
        Livres liv1 = new Livres ("The Crow","Warner Bros","Goscigny",2243);
        livresList.add(liv1);
        Livres liv2 = new Livres ("Back to future","Warner Bros","Goscigny",3478);
        livresList.add(liv2);
        Livres liv3 = new Livres ("Interview with a vampire","Live de poche","Anne Rice",7609);
        livresList.add(liv3);
        Livres liv4 = new Livres ("L'histoire sans fin","Gallimar","Jules Vernes",8756);
        livresList.add(liv4);
        Livres liv5 = new Livres ("La vie est belle","Uderzo","Goscigny",4925);
        livresList.add(liv5);

        System.out.println(liv1);



        return livresList;
    }

    //Méthode de récuperation d'une personne par son Id (Recois une valeur)

    @GetMapping("/{id}")
    public Livres getOneLivres(@PathVariable int id) {
        /*Livres liv;
        try {
            liv = livresService.findById(id);
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
        return liv;*/
        return new Livres ("toto","Uderzo","Goscigny",2222);
    }


}

