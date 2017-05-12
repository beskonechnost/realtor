package realtorPro.db.storege;

import realtorPro.db.entity.MyObject;
import realtorPro.db.entity.User;
import realtorPro.db.entity.Views;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


import java.util.Collection;

/**
 * Created by Андрей on 04.04.2017.
 */
public class HibernateStorage {
    private final SessionFactory factory;

    public HibernateStorage() {
        factory = new Configuration().configure().buildSessionFactory();
    }

    public interface Command<T>{
        T process(Session session);
    }

    private <T> T transaction(final Command<T> command){
        final Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        try {
            return command.process(session);
        }finally {
            tx.commit();
            session.close();
        }
    }


    public Collection<User> getList(String name){
        return transaction((Session session)-> session.createQuery("from " + name).list());
    }


    public User getUser(int id) {
        return null;
    }


    public MyObject getObject(int id) {
        return null;
    }

    public Views getView(int id) {
        return null;
    }

    public int addUser(User user) {
        return 0;
    }

    public int addObject(MyObject object) {
        return 0;
    }

    public int addView(Views view) {
        return 0;
    }

    public void editUser(User user) {

    }

    public void editObject(MyObject object) {

    }

    public void editView(Views view) {

    }

    public void deleteUser(int id) {

    }

    public void deleteObject(int id) {

    }

    public void deleteView(int id) {

    }

    public Collection<MyObject> getObjectsByPrice(double price) {
        return null;
    }

    public User findUserByEmail(String email) {
        return null;
    }
}
