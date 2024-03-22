package com.example.funciones;

public class Funciones2 {


    public static void main(String[] args) {

        int resultado1 = suma(1, 2);
        int resultado2 = suma(2,8);
        int resultado3 = suma(3,4);
        int resultado4 = suma(4,5);

        int resultado5 = suma(1, 2, 3);
        System.out.println(resultado5);

        System.out.println(calcularIVA(20));


    }


    static int suma(int a, int b) {
        return a + b;
    }

    //sobrecarga

    static int suma(int a, int b, int c) {
        return a + b + c;
    }

    static int suma(double a, double b){
        return (int) (a + b);
    }

    /**
     * Crear una función que reciba un precio y devuelva el precio con el IVA incluido
     */
    static double calcularIVA(double precio) {
        return precio + (precio * 0.21);
    }
}






