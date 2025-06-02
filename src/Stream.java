import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Stream {
    List<Integer> numbers = Arrays.asList(1,2,3,4,5,6);
    List<Integer> evennum = numbers.stream()
            .filter(n -> n % 2 == 0)
            .collect(Collectors.toList());

    List<String> names = Arrays.asList("amam","ali","hamza");
    List<String> uppercase = names.stream()
            .map(String::toUpperCase)
            .collect(Collectors.toList());

    List<String> Letters = Arrays.asList("ali","amam","hamza");
    Optional<String> startwitha = Letters.stream()
            .filter(letter -> letter.startsWith("a"))
            .findFirst();
















//    List<Integer> evensquares = numbers.stream()
//            .filter(n->n%2==0)
//            .map(n -> n * n)
//            .collect(Collectors.toList());
}
