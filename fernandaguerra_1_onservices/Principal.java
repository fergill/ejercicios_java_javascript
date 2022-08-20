package fernandaguerra_1_onservices;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserta una palabra en la siguiente línea para ver " +
                "si es palíndromo y haz clic en el botón Enter");

        String palabra = scanner.nextLine();

        System.out.println(esPalindromo(palabra));
    }

    public static boolean esPalindromo(String palabra){
        boolean resultado = true;

        palabra = palabra.replace(" ", "");

        for (int i = 0; i < palabra.length()/2; i++) {
            if(palabra.charAt(i) != palabra.charAt(palabra.length()-1-i)) {
                resultado = false;
                break;
            }
        }

        return resultado;
    }
}
