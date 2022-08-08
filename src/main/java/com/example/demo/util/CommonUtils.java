package com.example.demo.util;

import com.example.demo.model.dto.BloodAnalysisDTO;

import java.time.LocalDate;
import java.util.Random;

public class CommonUtils {
    public static BloodAnalysisDTO getRandomBloodAnalysis(){
        BloodAnalysisDTO analysis = new BloodAnalysisDTO();
        Random random = new Random();

        analysis.setUserId(1L);
        analysis.setRbc((double) random.nextInt(5));
        analysis.setHgb((double) random.nextInt(5));
        analysis.setRdwc((double) random.nextInt(5));
        analysis.setMcv((double) random.nextInt(5));
        analysis.setMch((double) random.nextInt(5));
        analysis.setMchc((double) random.nextInt(5));
        analysis.setHct((double) random.nextInt(5));
        analysis.setPlt((double) random.nextInt(5));
        analysis.setWbc((double) random.nextInt(5));
        analysis.setGran((double) random.nextInt(5));
        analysis.setMon((double) random.nextInt(5));
        analysis.setLym((double) random.nextInt(5));
        analysis.setEoz((double) random.nextInt(5));
        analysis.setBaz((double) random.nextInt(5));
        analysis.setSoe((double) random.nextInt(5));
        analysis.setTestingDate(LocalDate.now());

        return analysis;
    }
}
