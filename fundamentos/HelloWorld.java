package fundamentos;
/**
 * HelloWorld nome da minha classe
 * public: tipo de acesso da classe
 * class: tipo da classe
 */

public class HelloWorld {

    // Todo conteúdo deve ficar dentro do escopo da classe

    public static void main(String[] args) {

        int tipoInt = 10;
        double tipoDouble = 3.3;
        float tipoFloat = 1.0f;
        long tipoLong = 21312321;
        String tipoString = "sadasd";
        boolean tipoBoolean = true;

        if (tipoInt == 12) {
            System.out.println("tipoInt é igual a: " + tipoInt);
        } else if (tipoInt < 12) {
            System.out.println("tipoInt é menor que 12");
        } else {
            System.err.println("tipoInt não é igual a 12");
        }

        if (tipoDouble == 3.1) {
            System.out.println("tipoDouble é igual a: " + tipoDouble);
        } else {
            System.err.println("tipoDouble não é igual a: " + tipoDouble);
        }

        if (tipoFloat == 1.0f) {
            System.out.println("tipoFloat é igual a: " + tipoFloat);
        }
        if (tipoLong == 21312321) {
            System.out.println("tipoLong é igual a: " + tipoLong);
        }
        if (tipoString == "sadasd") {
            System.out.println("tipoString é igual a: " + tipoString);
        }
        if (tipoBoolean == true) {
            System.out.println("tipoBoolean é igual a: " + tipoBoolean);
        }

        int valorInicial = 0;
        while (valorInicial <= 10) {
            if (valorInicial == 10) {
                System.out.println("o valor inicial é igual a 10.");
            } else {
                System.out.println("o valor inicial é menor que 10. O valor inicial é: " + valorInicial);
            }
            valorInicial++;
        }
        System.out.println("Saiu do while");

        for(int i = 0; i <= 10; i++) {
            System.out.println("o valor de i é: " + i);
        }
    }

}