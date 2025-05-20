package exercise3Exception.main;

import exercise3Exception.dataClass.Banco;
import exercise3Exception.dataClass.CuentaBancaria;
import exercise3Exception.exception.IngresoSuperiorException;
import exercise3Exception.exception.SaldoInsuficienteException;
import exercise3Exception.initializer.BancoInitializer;



public class MainBanco {
    public static void main(String[] args) {



        BancoInitializer initializer = new BancoInitializer();
        Banco banco = new Banco(initializer.getCuentaBancariaList());

        // Mostrar cuentas iniciales
        System.out.println("--- Cuentas iniciales ---");
        banco.showBancoCuentas();

        // Operaciones
        try {
            CuentaBancaria primeraCuenta = initializer.getCuentaBancariaList().get(0);

            // Ingreso
            banco.ingresarDinero(primeraCuenta, 100.0);
            System.out.println("\n--- Después de ingresar 100 ---");
            banco.showBancoCuentas();

            // Retiro
            banco.retirarSaldo(primeraCuenta, 50.0);
            System.out.println("\n--- Después de retirar 50 ---");
            banco.showBancoCuentas();

        } catch (IngresoSuperiorException e) {
            System.out.println("Error en ingreso: " + e.getMessage());
        } catch (SaldoInsuficienteException e) {
            System.out.println("Error en retiro: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error inesperado: " + e.getMessage());
        }


    }
}
