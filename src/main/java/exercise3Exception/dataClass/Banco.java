package exercise3Exception.dataClass;


import exercise3Exception.exception.IngresoSuperiorException;
import exercise3Exception.exception.SaldoInsuficienteException;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    private List<CuentaBancaria>cuentaBancariaList;
    private IngresoACuenta ingresoACuenta;
    private RetirarACuenta retirarACuenta;

    public Banco(List<CuentaBancaria>cuentaBancariaList){
        this.cuentaBancariaList = cuentaBancariaList;
        this.ingresoACuenta = new IngresoACuenta();
        this.retirarACuenta = new RetirarACuenta();
    }

    public List<CuentaBancaria> getCuentaBancariaList() {
        return cuentaBancariaList;
    }

    public IngresoACuenta getIngresoACuenta() {
        return ingresoACuenta;
    }

    public RetirarACuenta getRetirarACuenta() {
        return retirarACuenta;
    }


    public void ingresarDinero(CuentaBancaria cuenta, double cantidad) throws IngresoSuperiorException {
        double nuevoSaldo = ingresoACuenta.ingresarDinero(cuenta, cantidad);
        cuenta.setSaldo(nuevoSaldo);
    }

    public void retirarSaldo(CuentaBancaria cuenta, double cantidad) throws SaldoInsuficienteException {
        double nuevoSaldo = retirarACuenta.retirarSaldo(cuenta, cantidad);
        cuenta.setSaldo(nuevoSaldo);
    }



    public void showBancoCuentas(){

        if (getCuentaBancariaList() == null || getCuentaBancariaList().isEmpty()) {
            System.out.println("No hay cuentas para mostrar");
            return;
        }
        System.out.println("=== CUENTAS DEL BANCO ===");

        for(CuentaBancaria cuentas: getCuentaBancariaList()){
            System.out.println(cuentas);
        }
    }


}
