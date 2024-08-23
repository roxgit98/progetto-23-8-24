package davideGiliberti.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "rivista")
public class Rivista extends Catalogo {
    @Column(name = "periodicità")
    @Enumerated(EnumType.STRING)
    private Periodicita periodicita;

    public Rivista() {
    }

    public Rivista(String titolo, int annoDiPubblicazione, int numeroPagine, Periodicita periodicita) {
        super(titolo, annoDiPubblicazione, numeroPagine);
        this.periodicita = periodicita;
    }

    public Periodicita getPeriodicita() {
        return periodicita;
    }

    public void setPeriodicita(Periodicita periodicita) {
        this.periodicita = periodicita;
    }

    @Override
    public String toString() {
        return "Rivista{" +
                "Isbn=" + getIsbn() +
                "periodicita=" + periodicita +
                '}';
    }
}
