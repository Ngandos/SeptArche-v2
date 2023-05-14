package fr.abbo.septArche.controllers;

import fr.abbo.septArche.DAO.StockRepository;
import fr.abbo.septArche.models.Stock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping(path="/stock")
public class StockController {

    @Autowired
    private StockRepository rep;
    @GetMapping()
    public List<Stock> findAll() {
        return rep.findAll();
    }
    @GetMapping("/{id}")
    public Optional<Stock> findById(@PathVariable Long id) {
        return rep.findById(id);
    }
}
