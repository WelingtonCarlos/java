package conta;

public class TesteContaBancaria {
    public static void main(String[] args) {
        
        ContaBancaria contaBancaria = new ContaBancaria(); 
    
        contaBancaria.setNumero("12345");
        contaBancaria.setTitular("Welington");

        contaBancaria.depositar(300);
        contaBancaria.sacar(222);
    }
}
