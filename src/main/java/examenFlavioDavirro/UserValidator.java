package examenFlavioDavirro;


import java.util.ArrayList;
import java.util.List;

public class UserValidator {
    private List<User> userList;

    public UserValidator(){
        this.userList = new ArrayList<>();
    }
    public void loadUser(){
        userList.add(new User("melon@gmail.com"));
        userList.add(new User("sandia@gmail.com"));
        userList.add(new User("rigoberta@gmail.com"));
        userList.add(new User("papanata@gmail.com"));


    }

    @Override
    public String toString() {
        return "UserValidator{" +
                "userList=" + userList +
                '}';
    }
}
