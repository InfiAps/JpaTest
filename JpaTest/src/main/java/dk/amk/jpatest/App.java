package dk.amk.jpatest;

import dk.amk.jpatest.model.Tbl1;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.sql.Timestamp;
import java.util.List;

public class App {

  private static void queryExample (EntityManager em) {
    Query q = em.createQuery("SELECT t from Tbl1 t");
    List<Tbl1> results = (List<Tbl1>) q.getResultList();
    for (Tbl1 tbl : results) {
      System.out.println("Entry " + tbl.getTbl1Index() + " Fld1: " + tbl.getFld1()  +
          " Fld2: " + tbl.getFld2()  +
          " Fld3: " + tbl.getFld3() +
          " Fld4: " + tbl.getFld4()
      );
    }
  }

  private static void storeExample(EntityManager em) {
    Tbl1 tbl1 = new Tbl1();
    tbl1.setTbl1Index(3L);
    tbl1.setFld1("String 3");
    tbl1.setFld2(3L);
    tbl1.setFld3(3.0);
    tbl1.setFld4(new Timestamp(System.currentTimeMillis()));
    em.getTransaction()
        .begin();
    em.persist(tbl1);
    em.getTransaction()
        .commit();

  }

  private static void deleteExample(EntityManager em) {
    Tbl1 tbl1_3 = em.find(Tbl1.class, 3L);
    em.getTransaction().begin();
    em.remove(tbl1_3);
    em.getTransaction().commit();
  }

  private static void updateExample(EntityManager em) {
    Tbl1 t = em.find(Tbl1.class, 3L);
    em.getTransaction().begin();
    t.setFld1("Updated String on index 3");
    em.getTransaction().commit();
  }

  public static void main(String[] args) {

    EntityManager em = PersistanceManager.PersistenceManager.INSTANCE.getEntityManager();

    queryExample(em);
    storeExample(em);
    queryExample(em);
    updateExample(em);
    queryExample(em);
    deleteExample(em);
    queryExample(em);



    em.close();
    PersistanceManager.PersistenceManager.INSTANCE.close();
  }
}