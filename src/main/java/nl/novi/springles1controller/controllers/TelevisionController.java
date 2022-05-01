package nl.novi.springles1controller.controllers;

import nl.novi.springles1controller.models.Televisions;
import nl.novi.springles1controller.repositories.TelevisionRepository;
import nl.novi.springles1controller.services.TelevisionService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "televisions")

public class TelevisionController {

//    private final TelevisionService televisionService;
//
//    public TelevisionController(TelevisionService televisionService) {
//        this.televisionService = televisionService;
//    }


    private final TelevisionRepository televisionRepository;

    public TelevisionController(TelevisionRepository televisionRepository) {
        this.televisionRepository = televisionRepository;
    }


//    @GetMapping
//    public ResponseEntity <List<Televisions>> getAllTelevisions() {
//        final List<Televisions> allTelevisions = televisionService.getAllTelevisions();
//        return ResponseEntity.ok(allTelevisions);
//    }

    @GetMapping
    public ResponseEntity <List<Televisions>> getAllTelevisions() {
        final List<Televisions> allTelevisions = televisionRepository.findAll();
        return ResponseEntity.ok(allTelevisions);
    }




    @GetMapping("{id}")
    public ResponseEntity<Televisions> getTelevisionByID(@PathVariable Long id) {
        final Optional<Televisions> televisions = televisionRepository.findById(id);
        return ResponseEntity.ok(televisions.get());
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Televisions> deleteTelevision(@PathVariable Long id) {
//        final Optional<Televisions> televisionsDelete = televisionRepository.findById(id);
        televisionRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }



    @PostMapping
    public ResponseEntity<Televisions> addTelevision(@RequestBody Televisions televisions) {
//        Televisions newTelevisions = new Televisions();
//        newTelevisions.setId(televisions.getId());
//        newTelevisions.setBrand(televisions.getBrand());
//        newTelevisions.setName(televisions.getName());
//        newTelevisions.setType(televisions.getType());

        final Televisions televisionsAdd = televisionRepository.save(televisions);
        return ResponseEntity.ok(televisionsAdd);
//        return ResponseEntity.noContent().build();
    }


    @PutMapping("{id}")
    public ResponseEntity<Televisions> updateTelevision(@PathVariable Long id, @RequestBody Televisions televisions) {
        final Televisions televisionsToUpdate = televisionRepository.getById(id);
//        televisionsToUpdate.setId(televisions.getId());
        televisionsToUpdate.setBrand(televisions.getBrand());
        televisionsToUpdate.setName(televisions.getName());
        televisionsToUpdate.setType(televisions.getType());
        final Televisions updatedTelevisions = televisionRepository.save(televisionsToUpdate);
//        return ResponseEntity.ok(televisions.getName());
        return ResponseEntity.ok(televisions);

    }

}




//    Customer customerToUpdate = customerRepository.getById(id);
//customerToUpdate.setName(customerDto.getName);
//        customerRepository.save(customerToUpdate);


