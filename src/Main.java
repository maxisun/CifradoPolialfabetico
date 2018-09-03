import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> lista = new ArrayList<>();
        List<Integer> lista2 = new ArrayList<>();
        int[] ascii = {65,66,67,68,69,70,71,72,73,74,75,76,77,78,209,79,80,81,82,83,84,85,86,87,88,89,90,48,49,50,51,52,53,54,55,56,57}; //37

        for(int i=0;i<ascii.length;i++){
            lista.add(ascii[i]);
            lista2.add(ascii[i]);
        }

        System.out.println("Ingrese cifrado:");
        String cifrado = scanner.nextLine().toUpperCase();
        System.out.println("Ingrese Texto:");
        String palabra = scanner.nextLine().toUpperCase();

        String[] alfabeto = cifrado.split("[A-Z]+",cifrado.length()); //empieza en 0
        String[] direcciones = cifrado.split("\\d+",cifrado.length()); //empieza en 1

        int a = Integer.parseInt(alfabeto[0]);
        int cont_letras =2;
        int cont_numeros = 1;

        StringBuffer buffer = new StringBuffer();

        for(int i=0;i<a;i++){ //recorre los alfabetos
            if(direcciones[cont_letras].equals("I")){
                Collections.rotate(lista2,Integer.parseInt(alfabeto[cont_numeros]));
            }else if(direcciones[cont_letras].equals("D")){
                Collections.rotate(lista2,-(Integer.parseInt(alfabeto[cont_numeros])));
            }
            cont_letras++;
            cont_numeros++;
        }

        int pene2 =0;
        for (int j=0;j<palabra.length();j++){
            pene2 = lista.indexOf((int)palabra.charAt(j));
            buffer.append((char) Integer.parseInt(String.valueOf(lista2.get(pene2))));
        }
        System.out.println(buffer.toString());


                /*
        buffer.append((char)(palabra.charAt(0)-Integer.parseInt(alfabeto[cont_numeros])));
        buffer.append((char)(palabra.charAt(1)-Integer.parseInt(alfabeto[cont_numeros])));
        //System.out.println(palabra.charAt(0)-1);
        */


/*
        for(int i=0;i<a;i++){ //recorre los alfabetos
            for(int j=0;j<palabra.length();j++){ //recorre la palabra
                if(direcciones[cont_letras].equals("I")){ //si es izquierda
                    if(palabra.charAt(j)<='P'){
                        buffer.append((char)(palabra.charAt(j)+Integer.parseInt(alfabeto[cont_numeros])+1));
                    }else{
                        buffer.append((char)(palabra.charAt(j)+Integer.parseInt(alfabeto[cont_numeros])));
                    }
                }else if(direcciones[cont_letras].equals("D")){
                    if(palabra.charAt(j)>='P'){
                        buffer.append((char)(palabra.charAt(j)- Integer.parseInt(alfabeto[cont_numeros])-1));
                    }else {
                        buffer.append((char) (palabra.charAt(j) - Integer.parseInt(alfabeto[cont_numeros])));
                    }
                }
            }
            cont_letras++;
            cont_numeros++;
            System.out.println(buffer.toString());
        }
*/

/*
        int pene = 0;
        for(int i=0;i<a;i++){ //recorre los alfabetos
            for(int j=0;j<palabra.length();j++){ //recorre la palabra
                if(direcciones[cont_letras].equals("I")){
                    Collections.rotate(lista,Integer.parseInt(alfabeto[cont_numeros]));
                    pene = lista.indexOf((int)palabra.charAt(j));
                    System.out.println(pene);
                    //buffer.append((char) Integer.parseInt(String.valueOf(lista.get(pene + Integer.parseInt(alfabeto[cont_numeros]) ))));
                }else if(direcciones[cont_letras].equals("D")){
                    Collections.rotate(lista,-Integer.parseInt(alfabeto[cont_numeros]));
                    //pene = lista.indexOf((int)palabra.charAt(j));
                    //buffer.append((char) Integer.parseInt(String.valueOf(lista.get(pene - Integer.parseInt(alfabeto[cont_numeros])))));
                }
            }
            cont_letras++;
            cont_numeros++;
            System.out.println(buffer);
            palabra = buffer.toString();
            buffer.setLength(0);
        }

        */
        //System.out.print(buffer.toString());

    }


}
