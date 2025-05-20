package examenFlavioDavirro;

import java.util.ArrayList;
import java.util.List;

public class PasswordValidator {
    private List<Password>passwordList;

    public PasswordValidator(){
        this.passwordList = new ArrayList<>();

    }
    public void loadPassword(){
        passwordList.add(new Password("Cacatua"));
        passwordList.add(new Password("Libro"));
        passwordList.add(new Password("Perejil"));
        passwordList.add(new Password("Totem"));

    }

    @Override
    public String toString() {
        return "PasswordValidator{" +
                "passwordList=" + passwordList +
                '}';
    }
}
