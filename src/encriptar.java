
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class encriptar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> lista = new ArrayList<>();
        List<Integer> lista2 = new ArrayList<>();
        int[] ascii = {65,66,67,68,69,70,71,72,73,74,75,76,77,78,209,79,80,81,82,83,84,85,86,87,88,89,90,48,49,50,51,52,53,54,55,56,57}; //37

        for(int i=0;i<ascii.length;i++){
            lista.add(ascii[i]);
            lista2.add(ascii[i]);
        }

        //System.out.println("Ingrese cifrado:");
        //String cifrado = scanner.nextLine().toUpperCase();
        String cifrado = args[0].toUpperCase();
        //System.out.println("Ingrese Texto:");
        String palabra = args[1].toUpperCase();
        //String palabra = scanner.nextLine().toUpperCase();

        String[] alfabeto = cifrado.split("[A-Z]+",cifrado.length()); //empieza en 0
        String[] direcciones = cifrado.split("\\d+",cifrado.length()); //empieza en 1

        int a = Integer.parseInt(alfabeto[0]);
        int cont_letras =2;
        int cont_numeros = 1;

        StringBuffer buffer = new StringBuffer();

        for(int i=0;i<a;i++){ //recorre los alfabetos
            if(direcciones[cont_letras].equals("I")){
                Collections.rotate(lista2,-(Integer.parseInt(alfabeto[cont_numeros])));
            }else if(direcciones[cont_letras].equals("D")){
                Collections.rotate(lista2,Integer.parseInt(alfabeto[cont_numeros]));
            }
            cont_letras++;
            cont_numeros++;
        }

        int palabra_cont =0;
        char[] pal_array = palabra.toCharArray();
        for (int j=0;j<palabra.length();j++){
            if(pal_array[j]==' '){
                buffer.append(" ");
            }else{
                palabra_cont = lista.indexOf((int)palabra.charAt(j));
                buffer.append((char) Integer.parseInt(String.valueOf(lista2.get(palabra_cont))));
            }

        }
        System.out.println(buffer.toString());
    }
    
    
    /*
    
    Ingrese cifrado:
3A56I6D7000D
Ingrese Texto:
PENEGRUESO
VKSKMX0KYU
    
    */
}
