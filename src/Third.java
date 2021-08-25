import java.util.Arrays;
import java.util.Collection;

public class Third {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Test sortedNumbers");
        Collection<String> collection = Arrays.asList("1,2,0", "4,5");

        int[] numbers = collection.stream().flatMapToInt((p) -> Arrays.asList(p.split(",")).stream().mapToInt(Integer::parseInt)).sorted().toArray();
        System.out.println("numbers = " + Arrays.toString(numbers));
    }
}
