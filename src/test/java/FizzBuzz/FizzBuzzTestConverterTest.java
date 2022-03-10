package FizzBuzz;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;



public class FizzBuzzTestConverterTest {

    /* following the GWT */
    @Test
    public void shouldReturnFizzWhenGivenMultiple3() {


        FizzBuzzConverter fizzBuzzConverter = new FizzBuzzConverter();

        String result = fizzBuzzConverter.convert(3);

        assertEquals("Fizz", result);
    }

    @Test
    public void shouldReturnBuzzWhenGivenMultiple5() {

        FizzBuzzConverter fizzBuzzConverter = new FizzBuzzConverter();

        String result = fizzBuzzConverter.convert(5);

        assertEquals("Buzz", result);


    }

    @Test
    public void shouldReturnBuzzWhenGivenMultiple15() {

        FizzBuzzConverter fizzBuzzConverter = new FizzBuzzConverter();
        String result = fizzBuzzConverter.convert(15);
        assertEquals("BuzzFizz",result);
    }

    @Test
    public void shouldReturnTheExactNumberWhenGivenNoneMultipleOF_3_5_7() {

        FizzBuzzConverter fizzBuzzConverter = new FizzBuzzConverter();
        String result = fizzBuzzConverter.convert(2);
        assertEquals("2",result);
    }



}
