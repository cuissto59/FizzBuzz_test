package FizzBuzz;

public class FizzBuzzConverter {


    public String convert(int i) {




        if(i % 3 == 0 && i % 5 != 0){
            return "Fizz";
        }
        if(i % 5 == 0 && i % 15 != 0){
            return "Buzz";
        }
        else
            return "BuzzFizz";
    }
}
