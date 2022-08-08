package com.example.demo.repository;

import com.example.demo.model.dto.BloodAnalysisDTO;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BloodAnalysisRepository extends CrudRepository<BloodAnalysisDTO, Long> {
    List<BloodAnalysisDTO> findByUserId(Long userId);
}
