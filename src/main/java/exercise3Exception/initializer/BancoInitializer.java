package exercise3Exception.initializer;

import exercise3Exception.dataClass.CuentaBancaria;

import java.util.ArrayList;
import java.util.List;

public class BancoInitializer {
    private List<CuentaBancaria>cuentaBancariaList;

    public BancoInitializer(){
        this.cuentaBancariaList = new ArrayList<>();
        loadCuenta();
    }

    public List<CuentaBancaria> getCuentaBancariaList() {
        return cuentaBancariaList;
    }

    public void loadCuenta(){
        cuentaBancariaList.add(new CuentaBancaria("Pepo",23.000));
        cuentaBancariaList.add(new CuentaBancaria("Maria",1000));
    }
}
