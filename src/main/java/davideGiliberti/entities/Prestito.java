package davideGiliberti.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "prestito")
public class Prestito {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_prestito")
    private long idPrestito;
    @Column(name = "utente_id")
    private int utenteId;
    @Column(name = "elemento_prestato")
    private int elementoPrestato;
    @Column(name = "data_inizio_prestito")
    private LocalDate dataInizioPrestito;
    @Column(name = "data_restituzione_prevista")
    private LocalDate dataRestituzionePrevista;
    @Column(name = "data_restituzione_effettiva")
    private LocalDate getDataRestituzioneEffettiva;
}
