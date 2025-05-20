package examenFlavioDavirro;

public class User {
    private String email;


    public User(String email){
        this.email = email;

    }

    public String getUserName() {
        return email;
    }

    @Override
    public String toString() {
        return "User{" +
                "email='" + email + '\'' +
                '}';
    }
}
