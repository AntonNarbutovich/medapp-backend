package com.example.demo.model.dto;

import javax.persistence.*;

@Entity
@Table(name = "biochemical_analysis")
public class BiochemicalAnalysisDTO extends Analysis {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Double act;
    private Double alt;
    private Double ggtp;
    private Double prt;
    private Double alb;
    private Double blrb;
    private Double urea;
    private Double crt;
    private Double chl;
    private Double trgl;
    private Double lpvp;
    private Double lpnp;
    private Double atrg;
    private Double urac;
    private Double glu;
    private Double clc;
    private Double neo;
    private Double chlo;
    private Double kl;
    private Double na;
    private Double mg;
    private Double fe;
    private Double cprot;
    private Double rheu;
    private Double astr;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getAct() {
        return act;
    }

    public void setAct(Double act) {
        this.act = act;
    }

    public Double getAlt() {
        return alt;
    }

    public void setAlt(Double alt) {
        this.alt = alt;
    }

    public Double getGgtp() {
        return ggtp;
    }

    public void setGgtp(Double ggtp) {
        this.ggtp = ggtp;
    }

    public Double getPrt() {
        return prt;
    }

    public void setPrt(Double prt) {
        this.prt = prt;
    }

    public Double getAlb() {
        return alb;
    }

    public void setAlb(Double alb) {
        this.alb = alb;
    }

    public Double getBlrb() {
        return blrb;
    }

    public void setBlrb(Double blrb) {
        this.blrb = blrb;
    }

    public Double getUrea() {
        return urea;
    }

    public void setUrea(Double urea) {
        this.urea = urea;
    }

    public Double getCrt() {
        return crt;
    }

    public void setCrt(Double crt) {
        this.crt = crt;
    }

    public Double getChl() {
        return chl;
    }

    public void setChl(Double chl) {
        this.chl = chl;
    }

    public Double getTrgl() {
        return trgl;
    }

    public void setTrgl(Double trgl) {
        this.trgl = trgl;
    }

    public Double getLpvp() {
        return lpvp;
    }

    public void setLpvp(Double lpvp) {
        this.lpvp = lpvp;
    }

    public Double getLpnp() {
        return lpnp;
    }

    public void setLpnp(Double lpnp) {
        this.lpnp = lpnp;
    }

    public Double getAtrg() {
        return atrg;
    }

    public void setAtrg(Double atrg) {
        this.atrg = atrg;
    }

    public Double getUrac() {
        return urac;
    }

    public void setUrac(Double urac) {
        this.urac = urac;
    }

    public Double getGlu() {
        return glu;
    }

    public void setGlu(Double glu) {
        this.glu = glu;
    }

    public Double getClc() {
        return clc;
    }

    public void setClc(Double clc) {
        this.clc = clc;
    }

    public Double getNeo() {
        return neo;
    }

    public void setNeo(Double neo) {
        this.neo = neo;
    }

    public Double getChlo() {
        return chlo;
    }

    public void setChlo(Double chlo) {
        this.chlo = chlo;
    }

    public Double getKl() {
        return kl;
    }

    public void setKl(Double kl) {
        this.kl = kl;
    }

    public Double getNa() {
        return na;
    }

    public void setNa(Double na) {
        this.na = na;
    }

    public Double getMg() {
        return mg;
    }

    public void setMg(Double mg) {
        this.mg = mg;
    }

    public Double getFe() {
        return fe;
    }

    public void setFe(Double fe) {
        this.fe = fe;
    }

    public Double getCprot() {
        return cprot;
    }

    public void setCprot(Double cprot) {
        this.cprot = cprot;
    }

    public Double getRheu() {
        return rheu;
    }

    public void setRheu(Double rheu) {
        this.rheu = rheu;
    }

    public Double getAstr() {
        return astr;
    }

    public void setAstr(Double astr) {
        this.astr = astr;
    }
}
