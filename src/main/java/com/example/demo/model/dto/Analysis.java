package com.example.demo.model.dto;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.time.LocalDate;

@MappedSuperclass
public class Analysis {

    protected Long userId;
    protected LocalDate testingDate;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public LocalDate getTestingDate() {
        return testingDate;
    }

    public void setTestingDate(LocalDate testingDate) {
        this.testingDate = testingDate;
    }
}
