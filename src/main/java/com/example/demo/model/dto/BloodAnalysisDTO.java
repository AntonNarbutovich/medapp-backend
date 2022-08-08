package com.example.demo.model.dto;

import javax.persistence.*;

@Entity
@Table(name = "blood_analysis")
public class BloodAnalysisDTO extends Analysis {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Double rbc;
    private Double hgb;
    private Double rdwc;
    private Double mcv;
    private Double mch;
    private Double mchc;
    private Double hct;
    private Double plt;
    private Double wbc;
    private Double gran;
    private Double mon;
    private Double lym;
    private Double eoz;
    private Double baz;
    private Double soe;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getRbc() {
        return rbc;
    }

    public void setRbc(Double rbc) {
        this.rbc = rbc;
    }

    public Double getHgb() {
        return hgb;
    }

    public void setHgb(Double hgb) {
        this.hgb = hgb;
    }

    public Double getRdwc() {
        return rdwc;
    }

    public void setRdwc(Double rdwc) {
        this.rdwc = rdwc;
    }

    public Double getMcv() {
        return mcv;
    }

    public void setMcv(Double mcv) {
        this.mcv = mcv;
    }

    public Double getMch() {
        return mch;
    }

    public void setMch(Double mch) {
        this.mch = mch;
    }

    public Double getMchc() {
        return mchc;
    }

    public void setMchc(Double mchc) {
        this.mchc = mchc;
    }

    public Double getHct() {
        return hct;
    }

    public void setHct(Double hct) {
        this.hct = hct;
    }

    public Double getPlt() {
        return plt;
    }

    public void setPlt(Double plt) {
        this.plt = plt;
    }

    public Double getWbc() {
        return wbc;
    }

    public void setWbc(Double wbc) {
        this.wbc = wbc;
    }

    public Double getGran() {
        return gran;
    }

    public void setGran(Double gran) {
        this.gran = gran;
    }

    public Double getMon() {
        return mon;
    }

    public void setMon(Double mon) {
        this.mon = mon;
    }

    public Double getLym() {
        return lym;
    }

    public void setLym(Double lym) {
        this.lym = lym;
    }

    public Double getEoz() {
        return eoz;
    }

    public void setEoz(Double eoz) {
        this.eoz = eoz;
    }

    public Double getBaz() {
        return baz;
    }

    public void setBaz(Double baz) {
        this.baz = baz;
    }

    public Double getSoe() {
        return soe;
    }

    public void setSoe(Double soe) {
        this.soe = soe;
    }
}
