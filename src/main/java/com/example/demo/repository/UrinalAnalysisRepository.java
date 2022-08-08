package com.example.demo.repository;

import com.example.demo.model.dto.UrinalAnalysisDTO;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UrinalAnalysisRepository extends CrudRepository<UrinalAnalysisDTO, Long> {
    List<UrinalAnalysisDTO> findByUserId(Long userId);
}
