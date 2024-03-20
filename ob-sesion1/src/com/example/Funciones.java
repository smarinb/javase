package com.example;

public class Funciones {
    public static void main(String[] args) {
        System.out.println("Bienvenido al E-commerce de zapatillas:");
        //opción 1: funcion sin parametros y sin tipo de retorno

        showMenu();

        //opcion 2: funcion sin parametros que devuelve algo

        System.out.println(getMenu());


        System.out.println(getPrice());

        //opcion 3: funcion con parametros sin tipo de retorno

        imprimirSaludo("Sergio");

        //opcion 4: funcion con parametros que devuelven algo

        System.out.println(obtenerNombre("Cristina"));

        int n1 = 10;
        int n2 = 20;

        System.out.println(sumarNumero(n1,n2));
    }

    private static int sumarNumero(int n1, int n2) {
        return n1 + n2;
    }

    private static String obtenerNombre(String name) {
        return "Buenas noches " + name;
    }

    private static void imprimirSaludo(String name) {
        System.out.println("Buenos días " + name);

    }

    /**
     * Void indicca que no devuelve nada
     */
  static void showMenu(){
      System.out.println("1. - Ver zapatillas");
      System.out.println("2. - Comprar zapatillas");
      System.out.println("3. - Salir");
    }


    static String getMenu(){
      return "Bienvenido al E-commerce de zapatillas: \n 1. - Ver zapatillas \n 2. - Comprar zapatillas \n 3. - Salir";
    }

    static double getPrice() {
      return 100.99;
    }
}
