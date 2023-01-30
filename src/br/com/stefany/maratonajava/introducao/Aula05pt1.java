package br.com.stefany.maratonajava.introducao;

// Estruturas condicionais
public class Aula05pt1 {

    public static void main(String[] args) {

        int idade = 15;
        boolean isAutorizadoComprarBebida = idade >= 18;

        if (isAutorizadoComprarBebida) {
            System.out.println("Autorizado a comprar bebida alcoólica");
        } else {
            System.out.println("Não autorizado a comprar bebida alcoólica");
        }

        System.out.println("Fora do if");
    }
}
