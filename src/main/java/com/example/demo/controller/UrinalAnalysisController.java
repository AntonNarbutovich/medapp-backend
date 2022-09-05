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
    public List<UrinalAnalysisDTO> getList(@RequestAttribute Long userId) {
        return urinalAnalysisRepository.findByUserId(userId);
    }

    @PostMapping
    public UrinalAnalysisDTO addAnalysis(@RequestAttribute Long userId, @RequestBody UrinalAnalysisDTO analysis) {
        analysis.setUserId(userId);
        urinalAnalysisRepository.save(analysis);
        return analysis;
    }

}
