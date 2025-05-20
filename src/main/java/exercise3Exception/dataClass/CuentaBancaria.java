package exercise3Exception.dataClass;

public class CuentaBancaria {
    private double saldo;
    private String name;

    public CuentaBancaria(String name, double saldo){
        this.name = name;
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getName() {
        return name;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return String.format("Cuenta [Nombre: %s, Saldo: %.2f€]", name, saldo);
    }
}
