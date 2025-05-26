import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * coffee -> Espresso, Latte
 * coffee, milk -> Latte
 * tea -> Chai
 * milk -> latte, chai
 *
 *
 */

public class Test1 {
    public static void main(String[] args) {
        // Menu de pratos e seus ingredientes
        Map<String, List<String>> menu = new HashMap<>();
        menu.put("Espresso", Arrays.asList("coffee"));
        menu.put("Latte", Arrays.asList("coffee", "milk"));
        menu.put("Chai", Arrays.asList("tea", "milk"));
        menu.put("Lemonade", Arrays.asList("lemon", "sugar"));

        List<String> includeIngredients = List.of("coffee", "milk");

        /**
         * o código abaixo retorna exatamente de acordo com a lista, agr ajuste para retornar casi tenha qualquer
         * elemento da lista includeIngredients, não precisa ter obrigatoriamente todos, batas ter apenas um que esteja
         * presente na lista
         */

        menu.entrySet().stream()
                .filter(dish -> dish.getValue().containsAll(includeIngredients))
                .forEach(System.out::println);

        System.out.println("---");

        menu.entrySet().stream()
                .filter(dish -> includeIngredients.stream().noneMatch(dish.getValue()::contains))
                .forEach(System.out::println);

    }
}
