package fundamentos;
import java.util.HashMap;
import java.util.Map;

public class CollectionsHashMap {
    public static void main(String[] args) {
        Map<String, Integer> notas = new HashMap<>();

        notas.put("Welington", 10);
        notas.put("Doralicy", 9);
        notas.put("Wilber", 6);
        notas.put("Wilna", 5);
        notas.put("Fanny", 4);
        notas.put("Iracy", 7);
        notas.put("Liana", 8);

        var nota = notas.get("Welington");
        
        System.out.println("Welington tirou " + nota);
    
        for ( Map.Entry<String, Integer> entry : notas.entrySet()) {
            String aluno = entry.getKey();
            Integer resultado = entry.getValue();

            System.out.println("A nota de " + aluno + " é " + resultado);
        }
    }
}
