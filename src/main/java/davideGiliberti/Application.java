package davideGiliberti;


import davideGiliberti.dao.CatalogoDAO;
import davideGiliberti.entities.Libro;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Application {
    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("biblioteca");

    public static void main(String[] args) {
        EntityManager em = emf.createEntityManager();
        CatalogoDAO catalogo = new CatalogoDAO(em);

        Libro libro1 = new Libro();


    }
}
