package FizzBuzz;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


public class FizzBuzzTestConverterTest {


    @Test
    public void shouldReturnFizzWhenGivenMultiple3() {

        FizzBuzzConverter fizzBuzzConverter = new FizzBuzzConverter();
        String result = fizzBuzzConverter.convert(3);
        assertEquals("Fizz",result);
    }
    @Test
    public void shouldReturnBuzzWhenGivenMultiple5() {
        FizzBuzzConverter fizzBuzzConverter = new FizzBuzzConverter();
        String result = fizzBuzzConverter.convert(5);
        assertEquals("Buzz",result);
    }


}
