package com.example.demo.controller;


import com.example.demo.model.dto.InstrumentalAnalysisDTO;
import com.example.demo.model.dto.UrinalAnalysisDTO;
import com.example.demo.repository.InstrumentalAnalysisRepository;
import com.example.demo.repository.UrinalAnalysisRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/analysis/instrumental")
//@PreAuthorize("hasRole('USER')")
public class InstrumentalAnalysisController {

    InstrumentalAnalysisRepository instrumentalAnalysisRepository;

    public InstrumentalAnalysisController(InstrumentalAnalysisRepository instrumentalAnalysisRepository) {
        this.instrumentalAnalysisRepository = instrumentalAnalysisRepository;
    }

    @GetMapping
    public List<InstrumentalAnalysisDTO> getList(@RequestAttribute Long userId) {
        return instrumentalAnalysisRepository.findByUserId(userId);
    }

    @PostMapping
    public InstrumentalAnalysisDTO addAnalysis(@RequestAttribute Long userId, @RequestBody InstrumentalAnalysisDTO analysis) {
        analysis.setUserId(userId);
        instrumentalAnalysisRepository.save(analysis);
        return analysis;
    }

}
