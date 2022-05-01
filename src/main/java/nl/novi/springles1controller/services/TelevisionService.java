package nl.novi.springles1controller.services;

import nl.novi.springles1controller.exceptions.RecordNotFoundException;
import nl.novi.springles1controller.models.Televisions;
import nl.novi.springles1controller.repositories.TelevisionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TelevisionService {

    private final TelevisionRepository televisionRepository;

    @Autowired
    public TelevisionService(TelevisionRepository televisionRepository) {
        this.televisionRepository = televisionRepository;
    }


    public List<Televisions> getAllTelevisions() {
        final List<Televisions> allTelevisions = televisionRepository.findAll();
        return allTelevisions;
    }

//    public Televisions getTelevision(Long id) {
//      Televisions televisionFound = televisionRepository.getById(id);
//        if (televisionFound == null)
//            throw new RecordNotFoundException("Cannot find television");
//        return televisionFound;
//    }

//
//    public Book getBook(int id) {
//        Book bookFound = ListOfBooks.getBook(id);
//        if (bookFound == null)
//            throw new RecordNotFoundException("Cannot find book")
//        return bookFound;



}
