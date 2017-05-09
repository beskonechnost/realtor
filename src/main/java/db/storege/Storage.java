package db.storege;

import db.entity.MyObject;
import db.entity.User;
import db.entity.Views;

import java.util.Collection;

/**
 * Created by Андрей on 02.04.2017.
 */
public interface Storage {

    public Collection<User> getAllUsers();
    public Collection<MyObject> getAllMyObjects();
    public Collection<Views> getAllViews();

    public User getUser(final int id);
    public MyObject getObject(final int id);
    public Views getView(final int id);

    public int addUser(User user);
    public int addObject(MyObject object);
    public int addView(Views view);

    public void editUser(User user);
    public void editObject(MyObject object);
    public void editView(Views view);

    public void deleteUser(final int id);
    public void deleteObject(final int id);
    public void deleteView(final int id);

    public Collection<MyObject> getObjectsByPrice(double price);
    public User findUserByEmail(final String email);
}
