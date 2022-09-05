package com.example.demo.controller;


import com.example.demo.model.dto.BloodAnalysisDTO;
import com.example.demo.repository.BloodAnalysisRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/analysis/general-blood")
//@PreAuthorize("hasRole('USER')")
public class GeneralBloodAnalysisController {

    BloodAnalysisRepository generalBloodAnalysisRepository;

    public GeneralBloodAnalysisController(BloodAnalysisRepository generalBloodAnalysisRepository) {
        this.generalBloodAnalysisRepository = generalBloodAnalysisRepository;
    }

    @GetMapping
    public List<BloodAnalysisDTO> getList(@RequestAttribute Long id) {
        return generalBloodAnalysisRepository.findByUserId(id);
    }

    @PostMapping
    public BloodAnalysisDTO addAnalysis(@RequestBody BloodAnalysisDTO analysis) {
        generalBloodAnalysisRepository.save(analysis);
        return analysis;
    }

}
