package dk.amk.jpatest;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Created by joegus on 1/30/16.
 */
public class PersistanceManager {

  public enum PersistenceManager {
    INSTANCE;
    private EntityManagerFactory emFactory;
    PersistenceManager() {
      // "jpa-example" was the value of the name attribute of the
      // persistence-unit element.
      emFactory = Persistence.createEntityManagerFactory("jpa-example");
    }
    public EntityManager getEntityManager() {
      return emFactory.createEntityManager();
    }
    public void close() {
      emFactory.close();
    }
  }
}
