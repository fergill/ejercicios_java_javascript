package fernandaguerra_1_onservices;

import java.text.Normalizer;
import java.util.Scanner;



public class Palindromo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserta una palabra o frase en la siguiente línea para ver " +
                "si es palíndromo y haz clic en el botón Enter");

        String input = scanner.nextLine().toLowerCase();
        String palabro = Normalizer.normalize(input, Normalizer.Form.NFD);
        String palabra = palabro.replaceAll("[\\p{InCombiningDiacriticalMarks}]", "");

        System.out.println(palabra);
        System.out.println(esPalindromo(palabra));

    }


    public static boolean esPalindromo(String palabra) {

        boolean resultado = true;

        palabra = palabra.replace(" ", "");
        for (int i = 0; i < palabra.length() / 2; i++) {
            if (palabra.charAt(i) != palabra.charAt(palabra.length() - 1 - i)) {
                resultado = false;
                break;
            }
        }
        return resultado;

    }

}




