package FizzBuzz;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ListFactoryTest {


    @Test
    public void shouldReturnAListOfNumbersBetweenAGivingRange_2(){

        ListFactory listFactory = new ListFactory();
        List<Integer> result = listFactory.initiateList(2);
        List<Integer> expect = new ArrayList<>();
        expect.add(0);
        expect.add(1);
        expect.add(2);
        assertArrayEquals(expect.toArray(),result.toArray());

    }


}
