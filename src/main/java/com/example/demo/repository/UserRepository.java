package com.example.demo.repository;

import com.example.demo.model.dto.UserDTO;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepository extends CrudRepository<UserDTO, Long> {
    List<UserDTO> findByFirebaseId(String userId);

}
