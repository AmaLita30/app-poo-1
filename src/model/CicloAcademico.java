package model;

import java.time.LocalDate;
import java.util.Calendar;

public class CicloAcademico {
    private Integer idCicloAcademico;
    private String nombreCA;
    private String descripCa;
    private LocalDate feIni;
    private LocalDate feFin;

    public Integer getIdCicloAcademico() {
        return idCicloAcademico;
    }

    public void setIdCicloAcademico(Integer idCicloAcademico) {
        this.idCicloAcademico = idCicloAcademico;
    }

    public String getNombreCA() {
        return nombreCA;
    }

    public void setNombreCA(String nombreCA) {
        this.nombreCA = nombreCA;
    }

    public String getDescripCa() {
        return descripCa;
    }

    public void setDescripCa(String descripCa) {
        this.descripCa = descripCa;
    }

    public LocalDate getFeIni() {
        return feIni;
    }

    public void setFeIni(LocalDate feIni) {
        this.feIni = feIni;
    }

    public LocalDate getFeFin() {
        return feFin;
    }

    public void setFeFin(LocalDate feFin) {
        this.feFin = feFin;
    }
}
