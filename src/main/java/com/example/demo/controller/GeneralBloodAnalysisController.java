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
    public List<BloodAnalysisDTO> getList(@RequestAttribute Long userId) {
        return generalBloodAnalysisRepository.findByUserId(userId);
    }

    @PostMapping
    public BloodAnalysisDTO addAnalysis(@RequestAttribute Long userId, @RequestBody BloodAnalysisDTO analysis) {
        analysis.setUserId(userId);
        generalBloodAnalysisRepository.save(analysis);
        return analysis;
    }

}
