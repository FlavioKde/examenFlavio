package exercise3Exception.interfaces;

import exercise3Exception.dataClass.CuentaBancaria;
import exercise3Exception.exception.SaldoInsuficienteException;

public interface Retirar {

    double retirarSaldo(CuentaBancaria cuentaBancaria, double cantidad) throws SaldoInsuficienteException;
}
