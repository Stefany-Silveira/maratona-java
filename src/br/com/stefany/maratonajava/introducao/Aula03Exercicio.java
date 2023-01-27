package br.com.stefany.maratonajava.introducao;

/* Tipos primitivos
Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

   Eu <nome>, morando no endereço <endereço>,
   confirmo que recebi o salário de <salario>, na data <data>
    */
public class Aula03Exercicio {

    public static void main(String[] args) {

        String nome = "Stefany";
        String endereco = "Avenida São Paulo 20, Jardim Brasil, SP - CEP 01234-567";
        String dataRecebimentoSalario = "27/01/2023";
        double salario = 2000;

        System.out.println("Eu " + nome  + ", morando no endereço " + endereco
                + ", confirmo que recebi o salário de " + salario  + ", na dataRecebimentoSalario " + dataRecebimentoSalario);


    }
}
