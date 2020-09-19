package com.dawityifter.trail.apifirst.controller;

//import com.dawityifter.trail.apifirst.api.PetsApi;
//import com.dawityifter.trail.apifirst.api.model.Pet;
import com.dawityifter.trail.apifirst.api.UserApi;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
//@RestController
//@Slf4j
//public class PetsController implements UserApi {
       // implements PetsApi {
//    @Override
//    public ResponseEntity<List<Pet>> listPets(Integer limit){
//        Pet pet1 = new Pet();
//        pet1.setId(1L);
//        pet1.setName("kitty");
//        pet1.setTag("cat");
//
//        Pet pet2 = new Pet();
//        pet2.setId(1L);
//        pet2.setName("snowy");
//        pet2.setTag("dog");
//
//        return ResponseEntity.ok(Arrays.asList(pet1, pet2));
//    }
//    @Override
//    public ResponseEntity<Pet> createPets() {
//        log.info("Create is called");
//
//        Pet pet2 = new Pet();
//        pet2.setId(1L);
//        pet2.setName("snowy");
//        pet2.setTag("dog");
//        return new ResponseEntity<>(pet2, HttpStatus.CREATED);
//
//    }


//}
