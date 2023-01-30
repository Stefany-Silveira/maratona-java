package br.com.stefany.maratonajava.introducao;

//Estruturas Condicionais - Operador ternário

public class Aula05pt3 {
    public static void main(String[] args) {

        // Doar se salario > 5000
        double salario = 6000;
        // (condicao) ? verdadeiro : falso

        String resultado =  salario > 5000 ? "Eu vou doar 500 para o DevDojo" : "Ainda não tenho condições";

        System.out.println(resultado);
    }
}
