package FizzBuzz;

import java.util.List;
import java.util.stream.Collectors;

public class Engine {



    public  List<String> fizzBuzz(int i) {
        FizzBuzzConverter converter = new FizzBuzzConverter();
        ListFactory listFactory = new ListFactory();

        //la list initiation
        List<Integer> intList = listFactory.initiateList(i);

        return intList.stream()
                .map(converter::convert)
                .collect(Collectors.toList());
    }
    }


