package com.example.demo.repository;

import com.example.demo.model.dto.InstrumentalAnalysisDTO;
import com.example.demo.model.dto.UrinalAnalysisDTO;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface InstrumentalAnalysisRepository extends CrudRepository<InstrumentalAnalysisDTO, Long> {
    List<InstrumentalAnalysisDTO> findByUserId(Long userId);
}
