package com.example.demo.repository;

import com.example.demo.model.dto.BiochemicalAnalysisDTO;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BiochemicalAnalysisRepository extends CrudRepository<BiochemicalAnalysisDTO, Long> {
    List<BiochemicalAnalysisDTO> findByUserId(Long userId);
}
