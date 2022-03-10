package FizzBuzz;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
public class EngineTest {



    @Test
    public void shouldReturnFizzForThe3rdValueOFTheList(){
        Engine fizzBuzzEngine = new Engine();
        List<String> result = fizzBuzzEngine.fizzBuzz(3);
        final String[] expect = new String[] {"1","2","Fizz"};

        assertArrayEquals(expect,result.toArray());
    }
}
