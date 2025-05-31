/* Crear un programa que muestre si la palabra ingresada por el usuario es palíndroma o no.*/

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese una palabra: ");
        String palabra = scanner.nextLine();

        // Convertir a minúsculas y eliminar espacios por si acaso
        String limpia = palabra.replaceAll("\\s+", "").toLowerCase();
        String invertida = new StringBuilder(limpia).reverse().toString();

        if (limpia.equals(invertida)) {
            System.out.println("La palabra es palíndroma.");
        } else {
            System.out.println("La palabra no es palíndroma.");
        }
    }
}
