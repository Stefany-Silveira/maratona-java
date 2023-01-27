package br.com.stefany.maratonajava.introducao;

//Operadores básicos: + - / *
public class Aula04 {
    public static void main(String[] args) {

        int numero1 = 10;
        int numero2 = 20;

        double soma = numero1 + numero2;
        double subtracao = numero1 - numero2;
        double divisao = numero1 / numero2;
        double multiplicacao = numero1 * numero2;

        System.out.println(soma);
        System.out.println(subtracao);
        System.out.println(divisao);
        System.out.println(multiplicacao);

        // %
        int resto = 21 % 7;
        System.out.println(resto);

        // <  > <= >= == !=
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezIgualDez = 10 == 10;
        boolean isDezDiferenteDez = 10 != 10;

        System.out.println("isDezMaiorQueVinte " + isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte " + isDezMenorQueVinte);
        System.out.println("isDezIgualVinte " + isDezIgualVinte);
        System.out.println("isDezIgualDez " + isDezIgualDez);
        System.out.println("isDezDiferenteDez " + isDezDiferenteDez);


    }
}
