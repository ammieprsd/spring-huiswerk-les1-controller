package nl.novi.springles1controller.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("televisions")
public class TelevisionController {

    @GetMapping
    public ResponseEntity<Object> GetAllTelevisions() {
        return ResponseEntity.ok("All Televisions");
    }


    @GetMapping({"id"})
    public ResponseEntity<Object> GetTelevisionByID(@PathVariable long id) {
        return ResponseEntity.ok("Television by ID");
    }


    @PostMapping
    public ResponseEntity<Object> addTelevision(@RequestBody String nameTelevision) {
        return ResponseEntity.created(null).build();
    }

    @PutMapping("{id}")
    public ResponseEntity<Object> updateBook(@PathVariable int id, @RequestBody String title) {
        return ResponseEntity.noContent();
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Object> deleteBook(@PathVariable int id) {
        return ResponseEntity.noContent();
    }

}







