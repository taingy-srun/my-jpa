import entities.Car;
import entities.Driver;
import entities.Owner;
import entities.Person;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;


public class Main {

    public static void main(String[] args) {
        System.out.println("App Start");

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("CarPU");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();

        Car civic = new Car(111,"Civic", "Honda", 2024, 0);

        Person jack = new Owner(213,"Jack", 29, civic);
        civic.setOwner(jack);

        Person jim = new Driver(113,"Jim", 24);
        civic.setDriver(jim);

        tx.begin();
        em.persist(civic);
        tx.commit();

        em.close();
        emf.close();

        System.out.println("App End");
    }

}
