import java.util.List;
import java.util.stream.IntStream;

public class First {
    public static void main(String[] args) {

        List<String> people = List.of("Petya", "Vasya", "Mariam", "Tanya", "Katrin", "Elisabeth", "Eleonora", "Daniil");
        System.out.println("\nЭлементы из листа people с нечетным индексом: ");
        IntStream.range(0, people.size())
                .filter(value -> value % 2 != 0)
                .mapToObj(value -> value + "." + people.get(value)).forEach(System.out::println);


        //   IntStream.range(0, people.size()).filter(i -> i % 2 == 0 && i != 1)
        //          .mapToObj(value -> (value +1) + "." + people.get(value)).forEach(System.out::println);


    }

}


