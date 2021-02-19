package com.co.sofka.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {

    private static final Logger logger = LoggerFactory.getLogger( App.class );

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader( new InputStreamReader( System.in ) );

        System.out.println( "Enter number 1: " );
        String textNumber1 = bufferedReader.readLine();

        System.out.println( "Enter number 2: " );
        String textNumber2 = bufferedReader.readLine();

        Long number1 = Long.valueOf( textNumber1 );
        Long number2 = Long.valueOf( textNumber2 );

        BasicCalculator calculator = new BasicCalculator();
        Long result1 = calculator.sum(number1, number2);
        Long result2 = calculator.restar(number1, number2);
        Long result3 = calculator.multiplicar(number1, number2);
        Long result4 = calculator.dividir(number1, number2);

        System.out.println(number1 + " + " + number2 + " = " + result1);
        System.out.println(number1 + " - " + number2 + " = " + result2);
        System.out.println(number1 + " * " + number2 + " = " + result3);
        System.out.println(number1 + " / " + number2 + " = " + result4);
    }
}