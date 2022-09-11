package com.example.demo.model.dto;

import javax.persistence.*;

@Entity
@Table(name = "instrumental_analysis")
public class InstrumentalAnalysisDTO extends Analysis {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private byte[] image;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }
}
