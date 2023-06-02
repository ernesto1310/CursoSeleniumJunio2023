package org.example;

public class Main {
    public static void main(String[] args) {

        // Tema 1: Variables
        // Fases de una variable
        // 1- Declaracion
        // 2- Inicializacion
        // 3- Utilizacion
//        int x = 2;
//        System.out.println("El valor de x es: " + x);

        // Tema 2: Tipos de Datos
        // Datos Primitivos
        /**
         * Data Type	    Size	    Description
         * byte	            1 byte	    Stores whole numbers from -128 to 127
         * short	        2 bytes	    Stores whole numbers from -32,768 to 32,767
         * int	            4 bytes	    Stores whole numbers from -2,147,483,648 to 2,147,483,647
         * long	            8 bytes	    Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
         * float	        4 bytes	    Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
         * double	        8 bytes	    Stores fractional numbers. Sufficient for storing 15 decimal digits
         * boolean	        1 bit	    Stores true or false values
         * char	            2 bytes	    Stores a single character/letter or ASCII values
         * String
         */

        // Tema 3: Operadores
        // Aritmeticos (+, -, *, /)
        // Unarios (++, --, +, -, !)
        // Relacionales (==, !=, >, <, =>, <=)
        // Condicionales (AND=&&, OR=||)

        // Tema 4: Condicionales
        // if
        // if else
        // if else if
        // nested if
        // switch

        // Variables
        int limiteDeVelocidad = 80; // km/hr
        int velocidadActual = 60;
        boolean isCarretera = false;

        if (isCarretera == true) {
            limiteDeVelocidad = 120;
            if (velocidadActual > limiteDeVelocidad) {
                System.out.println("Vas a exceso de velocidad");
            }
            else {
                System.out.println("Vas dentro del limite de velocidad");
            }
        }
        else if (velocidadActual > limiteDeVelocidad) {
            System.out.println("Vas a exceso de velocidad");
        }
        else {
            System.out.println("Vas dentro del limite de velocidad");
        }


        String iniciales = "DO";

        switch (iniciales) {
            case "PC":
                System.out.println("Pablo Contreras");
                break;
            case "DO":
                System.out.println("David Oliva");
                break;
            case "EA":
                System.out.println("Ernesto Anaya");
                break;
            default:
                System.out.println("Desconocido");
                break;
        }


        // Tema 5: Ciclos
        // while
        // do while
        // for

        // contador del 1-10
        int numero = 1;
        while (numero<=10) {
            System.out.println("El numero es: " + numero);
            numero++;
        }


        // Sumatoria de un numero hasta llegar a 100
        int sumaNumero = 15;
        int suma = 0;
        int cont = 0;

        do {
            suma = suma + sumaNumero;
            cont++;
        } while (suma <= 100);

        System.out.println("El numero se sumo " + cont + " veces");


        // Contador 1-10
        numero = 10;
        for (int i = 1; i <= numero; i++) {
            System.out.println("El numero es: " + i);
        }

//        System.out.println("Hello world!");

    }
}