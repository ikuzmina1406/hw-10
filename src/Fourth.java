import java.util.stream.Stream;


public class Fourth {
    public static Stream<Long> random(long a, long c, long m, long seed) {

        return Stream.iterate(seed, x -> 1 * (a * (x + c)) % m)
                .limit(20);

    }

    public static void main(String[] args) {
        Stream<Long> generator = random(25214903917L, 11, 2 ^ 48L, 0);
        generator.forEach(System.out::println);
    }
}
