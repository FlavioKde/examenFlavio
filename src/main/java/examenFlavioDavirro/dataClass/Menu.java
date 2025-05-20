package examenFlavioDavirro.dataClass;

import examenFlavioDavirro.exception.UserIncorrectoException;
import examenFlavioDavirro.logic.UserValidator;

import java.util.Scanner;


public class Menu {
    private static UserValidator userValidator = new UserValidator();


    public static int mostrarMenu() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n=== MENÚ PRINCIPAL ===");
        System.out.println("1. Login");
        System.out.println("2. Opción 2");
        System.out.println("3. Opción 3");
        System.out.println("4. Salir");
        System.out.print("Elige una opción: ");

        return scanner.nextInt();
    }

    public static void manejarOpcion(int opcion) {
        Scanner scanner = new Scanner(System.in);

        switch (opcion) {
            case 1:
                System.out.println("\n--- Login ---");
                try {
                    System.out.print("Email: ");
                    String email = scanner.nextLine();

                    if (!userValidator.validateUser(email)) {
                        throw new UserIncorrectoException("Error: Email no registrado");
                    }
                    System.out.println("¡Email válido!");

                } catch (UserIncorrectoException e) {
                    System.err.println(e.getMessage());

                }
                break;
        }
    }
}