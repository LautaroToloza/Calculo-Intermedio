package Principal;

import java.util.Scanner;

/**
 * @author Lautaro Toloza
 */
public class Principal {

    /* Ejercicio:
       Dado dos identificadores A y B de tipo entero.
       Los valores iniciales serán 25 y 100 deberá mostrar
       por pantalla las siguientes operaciones aritméticas
       suma, resta, multiplicación, división y resto.
     */
    public static void main(String[] args) {
        // Carga por teclado de A
        Scanner leer = new Scanner(System.in);
        System.out.print("Escribe el valor de A: ");
        String valorA = leer.nextLine();
        int a = Integer.parseInt(valorA);

        // Carga por teclado de B
        System.out.print("Escribe el valor de B: ");
        String valorB = leer.nextLine();
        int b = Integer.parseInt(valorB);

        // Operaciones Aritméticas
        int suma = a + b;
        int resta = a - b;
        int multiplicacion = a * b;
        int division = 0;
        int resto = 0;

        //Condicinal si a > b y b > 0 y viceversa. caso contrario queda el valor de 0 ya definido
        if (a > b && b > 0) {
            division = a / b;
            resto = a % b;
        } else if (a > 0) {
            division = b / a;
            resto = b % a;
        } else {
        }

        // Salida por pantalla de los resultados
        System.out.println("Resultados..");
        System.out.println("-------------------------");
        System.out.println("Suma = " + suma);
        System.out.println("Resta = " + resta);
        System.out.println("Multiplicación = " + multiplicacion);
        System.out.println("División = " + division);
        System.out.println("Resto = " + resto);
        System.out.println("-------------------------");

    }

}
