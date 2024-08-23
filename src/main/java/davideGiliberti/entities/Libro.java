package davideGiliberti.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "libro")
public class Libro extends Catalogo {
    @Column(name = "autore")
    private String autore;
    @Column(name = "genere")
    private String genere;

    public Libro() {
    }

    public Libro(String titolo, int annoDiPubblicazione, int numeroPagine, String autore, String genere) {
        super(titolo, annoDiPubblicazione, numeroPagine);
        this.autore = autore;
        this.genere = genere;
    }

    public String getAutore() {
        return autore;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public String getGenere() {
        return genere;
    }

    public void setGenere(String genere) {
        this.genere = genere;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "Isbn=" + getIsbn() +
                "autore='" + autore + '\'' +
                ", genere='" + genere + '\'' +
                '}';
    }
}
