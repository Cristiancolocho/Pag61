/* Desarrollar un programa que muestre la cantidad de veces
 que aparece la vocal “A” en una frase ingresada
por la persona usuaria. */

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese una frase: ");
        String frase = scanner.nextLine();

        int contador = 0;
        for (char c : frase.toCharArray()) {
            if (c == 'A' || c == 'a') {
                contador++;
            }
        }

        System.out.println("La vocal 'A' aparece " + contador + " veces.");
    }
}
