package fernandaguerra_1_onservices;

import org.apache.commons.codec.binary.StringUtils;

import java.util.Scanner;

public class Charsets {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Inserta una palabra o frase en la siguiente línea para ver " +
                    "salidas en Iso-8859-1 y en UTF8");

            String test = scanner.nextLine();

            byte[] bytesIsoTest = StringUtils.getBytesIso8859_1(test);
            String testIsoEncoded = StringUtils.newStringUtf8(bytesIsoTest);

            byte[] bytesUtf8Test = StringUtils.getBytesUtf8(test);
            String testUtf8Encoded = StringUtils.newStringUtf8(bytesUtf8Test);
            System.out.println(testIsoEncoded + " - ISO 8859-1");
            System.out.println(testUtf8Encoded + " - UTF-8");
        }
}








