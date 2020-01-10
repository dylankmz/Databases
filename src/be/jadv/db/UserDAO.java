package be.jadv.db;

import java.util.ArrayList;

public class UserDAO {

    private long id;
    private String username;

    public UserDAO() {
    }

    public UserDAO(long id, String username) {
        this.id = id;
        this.username = username;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "UserDAO{" + "id=" + id + ", username='" + username + '\'' + '}';
    }


}
