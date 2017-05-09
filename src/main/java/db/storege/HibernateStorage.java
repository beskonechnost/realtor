package db.storege;

import db.entity.MyObject;
import db.entity.User;
import db.entity.Views;

import java.util.Collection;

/**
 * Created by Андрей on 04.04.2017.
 */
public class HibernateStorage implements Storage {
    @Override
    public Collection<User> getAllUsers() {
        return null;
    }

    @Override
    public Collection<MyObject> getAllMyObjects() {
        return null;
    }

    @Override
    public Collection<Views> getAllViews() {
        return null;
    }

    @Override
    public User getUser(int id) {
        return null;
    }

    @Override
    public MyObject getObject(int id) {
        return null;
    }

    @Override
    public Views getView(int id) {
        return null;
    }

    @Override
    public int addUser(User user) {
        return 0;
    }

    @Override
    public int addObject(MyObject object) {
        return 0;
    }

    @Override
    public int addView(Views view) {
        return 0;
    }

    @Override
    public void editUser(User user) {

    }

    @Override
    public void editObject(MyObject object) {

    }

    @Override
    public void editView(Views view) {

    }

    @Override
    public void deleteUser(int id) {

    }

    @Override
    public void deleteObject(int id) {

    }

    @Override
    public void deleteView(int id) {

    }

    @Override
    public Collection<MyObject> getObjectsByPrice(double price) {
        return null;
    }

    @Override
    public User findUserByEmail(String email) {
        return null;
    }
}
