package longnd.thesis.data.entity;

public class User {
    private String email;
    private String pass;

    public User() {
    }

    public User(String email, String pass) {
        this.email = email;
        this.pass = pass;
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

    public boolean isEmpty() {
        if (email == null || pass == null) {
            return true;
        }
        return false;
    }
}
