import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String palabra = scanner.nextLine();
        String[] alfabeto = palabra.toUpperCase().split("[A-Z]+",palabra.length());
        String[] direcciones = palabra.toUpperCase().split("[0-9]+",palabra.length());

        StringBuffer buffer = new StringBuffer();
        buffer.append((char)('A'+25));
        //System.out.println(buffer.toString());
    }
}
