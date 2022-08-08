package com.example.demo.model.dto;

import javax.persistence.*;

@Entity
@Table(name = "urinal_analysis")
public class UrinalAnalysisDTO extends Analysis {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String clr;
    private String trnsp;
    private Double dens;
    private Double ph;
    private Double prt;
    private Double glu;
    private Double ktn;
    private Double urblg;
    private Double blrb;
    private Double hgb;
    private Double ntrt;
    private Double eptFl;
    private Double eptTr;
    private Double eptRn;
    private Double lkc;
    private Double ery;
    private Double cld;
    private Double slt;
    private Double slm;
    private Double bctr;
    private Double yst;



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getClr() {
        return clr;
    }

    public void setClr(String clr) {
        this.clr = clr;
    }

    public String getTrnsp() {
        return trnsp;
    }

    public void setTrnsp(String trnsp) {
        this.trnsp = trnsp;
    }

    public Double getDens() {
        return dens;
    }

    public void setDens(Double dens) {
        this.dens = dens;
    }

    public Double getPh() {
        return ph;
    }

    public void setPh(Double ph) {
        this.ph = ph;
    }

    public Double getPrt() {
        return prt;
    }

    public void setPrt(Double prt) {
        this.prt = prt;
    }

    public Double getGlu() {
        return glu;
    }

    public void setGlu(Double glu) {
        this.glu = glu;
    }

    public Double getKtn() {
        return ktn;
    }

    public void setKtn(Double ktn) {
        this.ktn = ktn;
    }

    public Double getUrblg() {
        return urblg;
    }

    public void setUrblg(Double urblg) {
        this.urblg = urblg;
    }

    public Double getBlrb() {
        return blrb;
    }

    public void setBlrb(Double blrb) {
        this.blrb = blrb;
    }

    public Double getHgb() {
        return hgb;
    }

    public void setHgb(Double hgb) {
        this.hgb = hgb;
    }

    public Double getNtrt() {
        return ntrt;
    }

    public void setNtrt(Double ntrt) {
        this.ntrt = ntrt;
    }

    public Double getEptFl() {
        return eptFl;
    }

    public void setEptFl(Double eptFl) {
        this.eptFl = eptFl;
    }

    public Double getEptTr() {
        return eptTr;
    }

    public void setEptTr(Double eptTr) {
        this.eptTr = eptTr;
    }

    public Double getEptRn() {
        return eptRn;
    }

    public void setEptRn(Double eptRn) {
        this.eptRn = eptRn;
    }

    public Double getLkc() {
        return lkc;
    }

    public void setLkc(Double lkc) {
        this.lkc = lkc;
    }

    public Double getEry() {
        return ery;
    }

    public void setEry(Double ery) {
        this.ery = ery;
    }

    public Double getCld() {
        return cld;
    }

    public void setCld(Double cld) {
        this.cld = cld;
    }

    public Double getSlt() {
        return slt;
    }

    public void setSlt(Double slt) {
        this.slt = slt;
    }

    public Double getSlm() {
        return slm;
    }

    public void setSlm(Double slm) {
        this.slm = slm;
    }

    public Double getBctr() {
        return bctr;
    }

    public void setBctr(Double bctr) {
        this.bctr = bctr;
    }

    public Double getYst() {
        return yst;
    }

    public void setYst(Double yst) {
        this.yst = yst;
    }
}
