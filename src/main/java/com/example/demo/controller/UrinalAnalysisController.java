package com.example.demo.controller;


import com.example.demo.model.dto.UrinalAnalysisDTO;
import com.example.demo.repository.UrinalAnalysisRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/analysis/urinal")
//@PreAuthorize("hasRole('USER')")
public class UrinalAnalysisController {

    UrinalAnalysisRepository urinalAnalysisRepository;

    public UrinalAnalysisController(UrinalAnalysisRepository urinalAnalysisRepository) {
        this.urinalAnalysisRepository = urinalAnalysisRepository;
    }

    @GetMapping
    public List<UrinalAnalysisDTO> getList() {
        return urinalAnalysisRepository.findByUserId(1L);
    }

    @PostMapping
    public UrinalAnalysisDTO addAnalysis(@RequestBody UrinalAnalysisDTO analysis) {
        urinalAnalysisRepository.save(analysis);
        return analysis;
    }

}
