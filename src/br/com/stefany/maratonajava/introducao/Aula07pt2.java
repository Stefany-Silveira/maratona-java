package br.com.stefany.maratonajava.introducao;

//Arrays
public class Aula07pt2 {
    //byte, short, int, long, float e double 0
    //char '\u0000' ' '
    // booleamn false
    //String null

    public static void main(String[] args) {

        String[] nomes = new String[3];
        nomes[0] = "Stefany";
        nomes[1] = "Pedro";
        nomes[2] = "Vinicius";

        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }
    }
}
