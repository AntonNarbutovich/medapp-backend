package com.example.demo.controller;


import com.example.demo.model.dto.BiochemicalAnalysisDTO;
import com.example.demo.repository.BiochemicalAnalysisRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/analysis/biochemical")
//@PreAuthorize("hasRole('USER')")
public class BiochemicalAnalysisController {

    BiochemicalAnalysisRepository biochemicalAnalysisRepository;

    public BiochemicalAnalysisController(BiochemicalAnalysisRepository generalBloodAnalysisRepository) {
        this.biochemicalAnalysisRepository = generalBloodAnalysisRepository;
    }

    @GetMapping
    public List<BiochemicalAnalysisDTO> getList(@RequestAttribute Long userId) {
        return biochemicalAnalysisRepository.findByUserId(userId);
    }

    @PostMapping
    public BiochemicalAnalysisDTO addAnalysis(@RequestAttribute Long userId, @RequestBody BiochemicalAnalysisDTO analysis) {
        analysis.setUserId(userId);
        biochemicalAnalysisRepository.save(analysis);
        return analysis;
    }

}
