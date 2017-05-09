package db.entity;

/**
 * Created by Андрей on 02.04.2017.
 */
public class User extends Entity {

    private String name;
    private String email;
    private String pass;
    private  String phone;
    private int roleId;
    private boolean registration;

    public User() {
    }
    public User(String name, String email, String pass, String phone, int roleId) {
        this.name = name;
        this.email = email;
        this.pass = pass;
        this.phone = phone;
        this.roleId = roleId;
        this.registration = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public boolean isRegistration() {
        return registration;
    }

    public void setRegistration(boolean registration) {
        this.registration = registration;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", pass='" + pass + '\'' +
                ", phone='" + phone + '\'' +
                ", roleId=" + roleId +
                ", registration=" + registration +
                "} " + super.toString();
    }
}
