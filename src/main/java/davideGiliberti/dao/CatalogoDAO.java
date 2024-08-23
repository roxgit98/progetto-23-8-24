package davideGiliberti.dao;

import davideGiliberti.entities.Catalogo;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

public class CatalogoDAO {
    private EntityManager em;

    public CatalogoDAO(EntityManager em) {
        this.em = em;
    }

    public void salva(Catalogo libro) {
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

    public Catalogo ricercaIsbn(long isbn) {
        return em.find(Catalogo.class, isbn);
    }

    public void elimina(long isbn) {
        try {
            EntityTransaction t = em.getTransaction();
            t.begin();
            Catalogo found = em.find(Catalogo.class, isbn);
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
