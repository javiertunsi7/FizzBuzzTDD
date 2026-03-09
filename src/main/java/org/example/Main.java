package org.example;

import org.example.FizzBuzz.FizzBuzz;

public class Main {
    static void main(){

        for (int index = 1; index <= 15; index++) {
            String result = new FizzBuzz().convert(index);
            System.out.println(result);
        }
    }
}