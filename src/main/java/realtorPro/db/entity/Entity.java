package realtorPro.db.entity;

import java.io.Serializable;

/**
 * Created by Андрей on 02.04.2017.
 */
public abstract class Entity implements Serializable{

    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "id = " + id;
    }

}
