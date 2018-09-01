import java.util.ArrayList;
import java.util.List;

import Class.Texto;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> ascii = new ArrayList<>();

        for(int i=65;i<91;i++){
            ascii.add(i);
        }

        Texto texto = new Texto(ascii,"1");

        texto.print(ascii);

    }
}
