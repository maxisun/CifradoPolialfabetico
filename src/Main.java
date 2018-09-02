import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] ascii = {65,66,67,68,69,70,71,72,73,73,75,76,77,78,165,79,79,80,81,82,83,84,85,86,87,88,89,90,48,49,50,51,52,56,54,55,56,57}; //37

        System.out.println("Ingrese cifrado:");
        String cifrado = scanner.nextLine().toUpperCase();
        System.out.println("Ingrese Texto:");
        String palabra = scanner.nextLine().toUpperCase();

        String[] alfabeto = cifrado.split("[A-Z]+",cifrado.length()); //empieza en 0
        String[] direcciones = cifrado.split("\\d+",cifrado.length()); //empieza en 1

        int a = Integer.parseInt(alfabeto[0]);
        char[] aux= palabra.toCharArray();
        //int b = direcciones.length;
        int cont_letras =2;
        int cont_numeros = 1;

        System.out.println(ascii[37]);
        StringBuffer buffer = new StringBuffer();

        /*
        buffer.append((char)(palabra.charAt(0)-Integer.parseInt(alfabeto[cont_numeros])));
        buffer.append((char)(palabra.charAt(1)-Integer.parseInt(alfabeto[cont_numeros])));
        //System.out.println(palabra.charAt(0)-1);
        */



        for(int i=0;i<a;i++){ //recorre los alfabetos
            for(int j=0;j<palabra.length();j++){ //recorre la palabra
                if(direcciones[cont_letras].equals("I")){ //si es izquierda
                    if(palabra.charAt(j)>'N'){
                        buffer.append((char)(palabra.charAt(j)+Integer.parseInt(alfabeto[cont_numeros])+1));
                    }else{
                        buffer.append((char)(palabra.charAt(j)+Integer.parseInt(alfabeto[cont_numeros])));
                    }
                }else if(direcciones[cont_letras].equals("D")){
                    if(palabra.charAt(j)>'N'){
                        buffer.append((char)(palabra.charAt(j)- Integer.parseInt(alfabeto[cont_numeros])+1));
                    }else {
                        buffer.append((char) (palabra.charAt(j) - Integer.parseInt(alfabeto[cont_numeros])));
                    }
                }
            }
            cont_letras++;
            cont_numeros++;
        }

        /*
        for(int i=0;i<a;i++){ //recorre los alfabetos
            for(int j=0;j<palabra.length();j++){ //recorre la palabra
                if(direcciones[cont_letras].equals("I")){

                }else if(direcciones[cont_letras].equals("D")){
                    //aux.replace(aux.charAt(j),(char) (ascii[cont_numeros]));
                }
            }
            cont_letras++;
            cont_numeros++;
        }*/
        System.out.print(buffer.toString());
    }
}
