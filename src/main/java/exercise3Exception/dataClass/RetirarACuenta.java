package exercise3Exception.dataClass;

import exercise3Exception.exception.SaldoInsuficienteException;
import exercise3Exception.interfaces.Retirar;

public class RetirarACuenta implements Retirar {
    @Override
    public double retirarSaldo(CuentaBancaria cuentaBancaria, double cantidad) throws SaldoInsuficienteException {
        if(cantidad >  cuentaBancaria.getSaldo() ){
            throw new SaldoInsuficienteException("No podes retirar una cantidad que sea superior a tu saldo");
        }

        return cuentaBancaria.getSaldo() - cantidad;
    }

}
