package realtorPro.db.storege;

import realtorPro.db.entity.MyObject;
import realtorPro.db.entity.User;
import realtorPro.db.entity.Views;

import java.util.Collection;

/**
 * Created by Андрей on 02.04.2017.
 */
public interface Storage<T> {

    public Collection<T> getList();

    public T get(final int id);

    public int add(final T obj);

    public void edit(final T obj);

    public void delete(final int id);

    public T findByParameter(final String parameter);

    public int generateId();

    public void close();
}
