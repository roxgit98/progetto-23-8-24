package davideGiliberti.entities;

import jakarta.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@Table(name = "catalogo")
public abstract class Catalogo {
    @Id
    @Column(name = "codice_ISBN")
    private long Isbn;
    @Column(name = "titolo")
    private String titolo;
    @Column(name = "anno_di_pubblicazione")
    private int annoDiPubblicazione;
    @Column(name = "numero_pagine")
    private int numeroPagine;

    public Catalogo() {
    }


    public Catalogo(String titolo, int annoDiPubblicazione, int numeroPagine) {
        this.titolo = titolo;
        this.annoDiPubblicazione = annoDiPubblicazione;
        this.numeroPagine = numeroPagine;
    }

    public long getIsbn() {
        return Isbn;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public int getAnnoDiPubblicazione() {
        return annoDiPubblicazione;
    }

    public void setAnnoDiPubblicazione(int annoDiPubblicazione) {
        this.annoDiPubblicazione = annoDiPubblicazione;
    }

    public int getNumeroPagine() {
        return numeroPagine;
    }

    public void setNumeroPagine(int numeroPagine) {
        this.numeroPagine = numeroPagine;
    }

    @Override
    public String toString() {
        return "Catalogo{" +
                "Isbn=" + Isbn +
                ", titolo='" + titolo + '\'' +
                ", annoDiPubblicazione=" + annoDiPubblicazione +
                ", numeroPagine=" + numeroPagine +
                '}';
    }
}
