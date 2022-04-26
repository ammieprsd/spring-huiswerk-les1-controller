package nl.novi.springles1controller.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping
    ResponseEntity<String> Test(){
        return ResponseEntity.ok("Yes het is geconnected!!");
    }
}
