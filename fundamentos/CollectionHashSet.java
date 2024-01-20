package fundamentos;
import java.util.HashSet;

public class CollectionHashSet {
    public static void main(String[] args) {
        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(10);
        numbers.add(11);
        numbers.add(12);
        numbers.add(13);
        numbers.add(14);

        // System.out.println("o tamanho da minha coleções de números é " + numbers.size());

        // System.out.println("segue a baixo cada elemento da minha coleção numérica:");
        // for (Integer element : numbers) {
        //     System.out.println(element);
        // }

        // System.out.println(
        //         "Abaixo terá uma estrutura de repetiçãO que irá remover todos os números da lista exceto o último:");

        // int count = 0;
        // int index = 10;
        // while (count <= numbers.size()) {
        //     System.out.println("segue abaixo da nova coleção: ");
        //     for (Integer element : numbers) {
        //         System.out.println(element);
        //     }
        //     numbers.remove(index);
        //     System.out.println("segue abaixo da nova coleção: ");
        //     for (Integer element : numbers) {
        //         System.out.println(element);
        //     }
        //     System.out.println("o número que foi removido da seleção: " + index);
        //     count++;
        //     index++;
        // }

        // System.out.println("números restante da coleção:");
        // for (Integer element : numbers) {
        //     System.out.println(element);
        // }

        System.out.println(numbers.contains(13));
    }
}
