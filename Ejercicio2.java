/*Crear un programa que lea una cadena y quite los espacios en blanco. */

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese una cadena: ");
        String cadena = scanner.nextLine();

        // Reemplaza todos los espacios en blanco por nada
        String sinEspacios = cadena.replaceAll("\\s+", "");

        System.out.println("Cadena sin espacios: " + sinEspacios);
    }
}
