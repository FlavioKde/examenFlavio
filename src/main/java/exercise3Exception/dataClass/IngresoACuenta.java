package exercise3Exception.dataClass;

import exercise3Exception.exception.IngresoSuperiorException;
import exercise3Exception.interfaces.IngresarCuenta;

public class IngresoACuenta implements IngresarCuenta {
    @Override
    public double ingresarDinero(CuentaBancaria cuentaBancaria, double cantidad) throws IngresoSuperiorException {
        if(cantidad <= 0){
            throw new IngresoSuperiorException("Cantidad debe ser superior a 0€");
        }
        return cuentaBancaria.getSaldo() + cantidad;
    }
}
