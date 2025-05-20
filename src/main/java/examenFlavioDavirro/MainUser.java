package examenFlavioDavirro;

import java.util.Scanner;

public class MainUser {
    public static void main(String[] args) {

        UserValidator userValidator = new UserValidator();
        userValidator.loadUser();

        PasswordValidator passwordValidator = new PasswordValidator();
        passwordValidator.loadPassword();


        Scanner sc = new Scanner(System.in);
        String email = sc.next();

        public boolean validateUser(String email){
            String emailToCheck = " ";
            if (emails.contains(emailToCheck)) {
                System.out.println("El email " + emailToCheck + " está en la lista.");
            } else {
                System.out.println("El email " + emailToCheck + " no está en la lista.");
            }
        }


    }
}
