package Class;

import java.util.ArrayList;
import java.util.List;

public class Texto {

    private ArrayList<Integer> alfabeto;
    private String input;

    public Texto(ArrayList<Integer> alfabeto, String input) {
        this.alfabeto = alfabeto;
        this.input = input;
    }

    public Texto() {
    }

    public ArrayList<Integer> getAlfabeto() {
        return alfabeto;
    }

    public void setAlfabeto(ArrayList<Integer> alfabeto) {
        this.alfabeto = alfabeto;
    }

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    public void print(ArrayList<Integer> a){
        for (int i=0;i<a.size();i++) {
            System.out.print((char) a.get(i).byteValue());
        }
    }
}
