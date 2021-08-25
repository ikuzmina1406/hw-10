import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Fifth {
    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {
        List<T> list1 = first.collect(Collectors.toList());
        List<T> list2 = second.collect(Collectors.toList());
        int size = Math.min(list1.size(), list2.size());
        List<T> result = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            result.add(list1.get(i));
            result.add(list2.get(i));
        }
        return result.stream();

    }

    public static void main(String[] args) {
        Stream<String> first = Stream.of("one", "two", "three", "four", "five");
        Stream<String> second = Stream.of("ten", "nine", "eight", "seven");
        Stream<String> create = Fifth.zip(first, second);
        create.forEach(System.out::println);

    }
}
