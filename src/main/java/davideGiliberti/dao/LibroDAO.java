package davideGiliberti.dao;

import davideGiliberti.entities.Libro;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

public class LibroDAO {
    private EntityManager em;

    public LibroDAO(EntityManager em) {
        this.em = em;
    }

    public void salva(Libro libro) {
        try {
            EntityTransaction t = em.getTransaction();
            t.begin();
            em.persist(libro);
            t.commit();
            System.out.println("elemento aggiunto");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public Libro ricercaIsbn(long isbn) {
        return em.find(Libro.class, isbn);
    }

    public void elimina(long isbn) {
        try {
            EntityTransaction t = em.getTransaction();
            t.begin();
            Libro found = em.find(Libro.class, isbn);
            if (found != null) {
                em.remove(found);
                t.commit();
                System.out.println("elemento eliminato");
            } else System.out.println("elemento non trovato");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
