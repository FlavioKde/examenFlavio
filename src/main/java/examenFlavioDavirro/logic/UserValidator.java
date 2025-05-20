package examenFlavioDavirro.logic;

import examenFlavioDavirro.interfaces.ValidateUser;

import java.util.HashMap;

public class UserValidator implements ValidateUser {
    private HashMap<String, String> userList = new HashMap<>();

    public UserValidator() {
        loadUsers();
    }

    private void loadUsers() {
        userList.put("melon@gmail.com", "3232voy");
        userList.put("sandia@gmail.com", "decalogo32");
        userList.put("rigoberta@gmail.com", "treinta");
        userList.put("papanata@gmail.com", "2525user");
    }

    @Override
    public boolean validateUser(String email) {

        return email != null && !email.trim().isEmpty() && userList.containsKey(email);
    }
}