package realtorPro.db.entity;

/**
 * Created by Андрей on 02.04.2017.
 */
public class Role extends Entity{

    private String name;

    public Role() {
    }

    public Role(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "name = " + name;
    }
}
