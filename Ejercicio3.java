/*Crear un programa que lea una cadena, sustituya por mayúscula
 la primera letra de la cadena y la primera
letra después de un espacio.
*/
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese una cadena: ");
        String cadena = scanner.nextLine();

        StringBuilder resultado = new StringBuilder(cadena.length());
        boolean mayuscula = true;

        for (char c : cadena.toCharArray()) {
            if (mayuscula && Character.isLetter(c)) {
                resultado.append(Character.toUpperCase(c));
                mayuscula = false;
            } else {
                resultado.append(c);
            }
            if (c == ' ') {
                mayuscula = true;
            }
        }

        System.out.println("Cadena modificada: " + resultado.toString());
    }
}
