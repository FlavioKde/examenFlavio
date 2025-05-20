package exercise3Exception.interfaces;

import exercise3Exception.dataClass.CuentaBancaria;
import exercise3Exception.exception.IngresoSuperiorException;

public interface IngresarCuenta {
    double ingresarDinero(CuentaBancaria cuentaBancaria,double dinero)throws IngresoSuperiorException;
}
