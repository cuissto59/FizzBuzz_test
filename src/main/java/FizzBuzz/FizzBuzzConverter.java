package FizzBuzz;

public class FizzBuzzConverter {


    public String convert(int i) {



        // prioriter  à 15  car il est divisible par 5 et 3

        if(i % 15 == 0){
            return "BuzzFizz";
        }
        // on peut  changer les places entre 5 et 3 car ils ont le même ordre de priorité

        if(i % 5 == 0 ){
            return "Buzz";
        }
        if( i % 3 == 0 ) {
            return "Fizz";
        }
        return String.valueOf(i);

    }
}
