package br.com.stefany.maratonajava.introducao;

//Estrutura de repetição  - Break

public class Aula06pt3 {
    //Imprima os primeiros 25 números de um dado valor. Por exempli, 50
    public static void main(String[] args) {

        int valorMax = 50;
        for (int i = 0; i <= valorMax; i++) {
            if (i > 25) {
                break;
            }

            System.out.println(i);
        }
    }
}
