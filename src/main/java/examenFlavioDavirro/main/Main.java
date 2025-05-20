package examenFlavioDavirro.main;

import examenFlavioDavirro.dataClass.Menu;

public class Main {
    public static void main(String[] args) {



        while (true) {
            int opcion = Menu.mostrarMenu();
            Menu.manejarOpcion(opcion);
        }
    }
}