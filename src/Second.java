import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Second {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("People sorted start");

        Collection<String> collection = Arrays.asList("Petya", "Vasya", "Mariam", "Tanya", "Katrin");

        List<String> sorted = collection.stream().sorted((o1, o2) -> -o1.compareTo(o2)).map(String::toUpperCase).collect(Collectors.toList());
        System.out.println("sorted = " + sorted);
    }
}
