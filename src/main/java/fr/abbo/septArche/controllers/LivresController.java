package fr.abbo.septArche.controllers;

import fr.abbo.septArche.DAO.LivresRepository;
import fr.abbo.septArche.models.Livres;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping(path="/livres")
public class LivresController {
    @Autowired
    private LivresRepository rep;
   @GetMapping()
    public List<Livres> findAll() {
        return rep.findAll();
    }
    @GetMapping("/{id}")
    public Optional<Livres> findById(@PathVariable Long id) {
        return rep.findById(id);
    }
    @GetMapping(params = {"titre"})
    public Livres findByTitre(@RequestParam String titre) {
        return rep.findByTitre(titre);
    }
    @GetMapping({"auteurs"})
    public Livres findByAuteurs(@RequestParam String auteurs) {
        return (Livres) rep.findByAuteurs(auteurs);
    }
    @GetMapping({"editeurs"})
    public Livres findByEditeurs(@RequestParam String editeurs) {
        return (Livres) rep.findByEditeurs(editeurs);
    }
    @GetMapping(params = {"isbn"})
    public Livres findByIsbn(@RequestParam String isbn) {
        return rep.findByIsbn(isbn);
    }
}
