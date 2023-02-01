package br.com.stefany.maratonajava.introducao;

//Estrutura de repetição  - Exercício Break

public class Aula06pt4 {
    // Dado o valor de u, carro, descubra em quantas vezes ele pode ser parcelado
    // Condição valorParcela >= 1000
    public static void main(String[] args) {

        double valorTotal = 30000;

        for (int parcela = 1; parcela <= valorTotal; parcela++) {
            double valorParcela = valorTotal / parcela;

            if (valorParcela < 1000) {
                break;
            }

            System.out.println("Parcela " + parcela + " R$ " + valorParcela);

        }
    }
}
