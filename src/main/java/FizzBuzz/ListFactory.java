package FizzBuzz;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ListFactory {


    public List<Integer> initiateList(int i) {

        return IntStream.rangeClosed(0, i)
                .boxed()
                .collect(Collectors.toList());

    }
}
