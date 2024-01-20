package fundamentos;
import java.util.ArrayList;
import java.util.List;

public class EstruturaDeDados {
    public static void main(String[] args) {
        // Lista
        List<String> nomes = new ArrayList<>();
        nomes.add("Welington");
        nomes.add("Doralicy");
        nomes.add("Wilber");
        nomes.add("Wilna");
        nomes.add("Fanny");
        nomes.add("Iracy");
        nomes.add("Liana");

        // System.out.println(nomes.get(4));

        // for( String nome : nomes ) {
        // System.out.println("O nome é " + nome);
        // }

        nomes.forEach(nome -> System.out.println("O nome é " + nome));
    }
}
