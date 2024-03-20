package com.example;

public class Operadores {
    public static void main(String[] args) {


        //aritmeticos

        int number1 = 10;
        int number2 = 20;
        int result = number1 + number2;
        System.out.println(result);


        //De comparación

        System.out.println(number1>number2); //10 > 20 False
        System.out.println(number1>=number2); //10 >= 20 False
        System.out.println(number1==number2); //10 == 20 False
        System.out.println(number1!=number2); //10 != 20 True
        System.out.println(number1<number2); //10 < 20 True
        System.out.println(number1<=number2); //10 <= 20 True



        //Operadores logicos

        boolean resultadoLogico = number1 > number2 && number1 >89;
        System.out.println(resultadoLogico);
        /*
        AND 1 1 1
        AND 1 0 0
        AND 0 1 0

        OR 1 1 1
        OR 1 0 1
        OR 0 1 1


         */

        int age = 17;

        boolean driver = (age >= 18) && (age <=65);

        System.out.println(driver);



    }
}
