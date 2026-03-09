package fizzbuzz;

import org.example.FizzBuzz.FizzBuzz;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
/*
    Tu función debe cumplir las siguientes normas adicionales:

    Si el número es múltiplo de tres, devolverá la palabra "Fizz".
    Si el número es múltiplo de cinco, devolverá la palabra "Buzz".
    Si el número es múltiplo de tres y de cinco, devolverá la palabra "FizzBuzz".
    Si no coincide las opciones de arriba retorna el numero
*/
/*
    @Test
    void test(){
        assertEquals(true2, true2);
    }

*/

    @Test
    public void check_1_to_1(){
        assertEquals("1",new FizzBuzz().convert(1));
    }
    @Test
    public void check_2_to_2(){
        assertEquals("2", new FizzBuzz().convert(2));
    }
    @Test
    public void check_4_to_4(){
        assertEquals("4", new FizzBuzz().convert(4));
    }
    @Test
    public void check_7_to_7(){
        assertEquals("7", new FizzBuzz().convert(7));
    }
    @ParameterizedTest
    @CsvSource({
            "1, '1'",
            "2, '2'",
            "4, '4'",
            "7, '7'",
            "8, '8'",
    })
    void check_number_to_string(int input, String expectedOutput){
        assertEquals(expectedOutput, new FizzBuzz().convert(input));
    }
    /*
    @Test
    public void  check3_number_to_fizz(){
        assertEquals("Fizz", new FizzBuzz().convert(3));
    }

    @Test
    public void  check6_number6_to_fizz(){
        assertEquals("Fizz", new FizzBuzz().convert(6));
    }
    @Test
    public void  check6_number9_to_fizz(){
        assertEquals("Fizz", new FizzBuzz().convert(9));
    }

     */

    @ParameterizedTest
    @CsvSource({
            "5, 'Buzz'",
            "10, 'Buzz'",
            "20, 'Buzz'",
    })
    void check_number_to_buzz(int input, String expectedOutput){
        assertEquals(expectedOutput, new FizzBuzz().convert(input));
    }
    @ParameterizedTest
    @CsvSource({
            "15, 'FizzBuzz'",
            "30, 'FizzBuzz'",
            "45, 'FizzBuzz'",
    })
    void check_number_to_fizzbuzz(int input, String expectedOutput){
        assertEquals(expectedOutput, new FizzBuzz().convert(input));
    }
}
