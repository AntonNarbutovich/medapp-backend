package com.example.demo.controller;

import com.example.demo.model.dto.UrinalAnalysisDTO;
import com.example.demo.model.dto.UserDTO;
import com.example.demo.repository.UrinalAnalysisRepository;
import com.example.demo.repository.UserRepository;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthException;
import com.google.firebase.auth.FirebaseToken;
import org.apache.catalina.UserDatabase;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/auth")
    public ResponseEntity authenticate(@RequestHeader("Authorization") String token) {
        try {
            FirebaseToken decodedToken = FirebaseAuth.getInstance().verifyIdToken(token);
            List<UserDTO> userList = userRepository.findByFirebaseId(decodedToken.getUid());
            if(userList.isEmpty()){
                UserDTO newUser = new UserDTO();
                //newUser.setFirstName(decodedToken.getName().split(" ")[0]);
                //newUser.setLastName(decodedToken.getName().split(" ")[1]);
                newUser.setEmail(decodedToken.getEmail());
                //newUser.setImg(decodedToken.getPicture());
                //newUser.setProvider(decodedToken.getIssuer());
                newUser.setFirebaseId(decodedToken.getUid());
                newUser.setActive(true);

                userRepository.save(newUser);
            }
        } catch (FirebaseAuthException e) {
            return new ResponseEntity(HttpStatus.FORBIDDEN);
        }

        return new ResponseEntity(HttpStatus.OK);
    }

}