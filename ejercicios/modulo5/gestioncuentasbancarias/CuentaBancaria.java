package ejercicios.modulo5.gestioncuentasbancarias;

public interface CuentaBancaria {
    //metodo para depositar dinero en la cuenta
    void depositar (double monto);

    //metodo para retirar dinero de la cuenta
    void retirar(double monto) throws FondosInsuficientesException;

    //metodo para consultar saldo en la cuenta
    double consultarSaldo();

    //metodo para calcular interes si es que aplica
    double calcularIntereses();
}
