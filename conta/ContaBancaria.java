package conta;

public class ContaBancaria {
    private String numero;
    private String titular;
    private double saldo;

    public ContaBancaria() {
        saldo = 0.0;
    }

    // Getters and setters

    public void setNumero(String numero) {
        this.numero = numero;
    }
    public String getNumero() {
        return numero;
    }
    
    public void setTitular(String titular) {
        this.titular = titular;
    }
    public String getTitular() {
        return titular;
    }

    // depositar
    void depositar(double valor) {
        if (valor > 0) {
            saldo = saldo + valor;
            System.out.println("Depósito no valor de R$ " + valor + ". Saldo atual R$ " + saldo);
        } else {
            System.out.println("Valor de depósito insuficiente. Coloque um valor mais alto!");
        }
    }

    // sacar
    void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo = saldo - valor;
            System.out.println("Saque no valor de R$ " + valor + ". Saldo atual R$ " + saldo);
        } else {
            System.out.println("Saldo insuficiente para o valor de saque desejado. Saque um valor menor!");
        }
    }
}
