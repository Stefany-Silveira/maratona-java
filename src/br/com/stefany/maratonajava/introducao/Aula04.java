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

        System.out.println("---------------------------------------------");
        System.out.println("---------------------------------------------");

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

        System.out.println("---------------------------------------------");
        System.out.println("---------------------------------------------");

        // && (AND) || (or)
        int idade = 29;
        float salario = 3500f;
        boolean isDentroDaLeiMaiorQueTrinta = idade >= 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;

        System.out.println("isDentroDaLeiMaiorQueTrinta " + isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMneorQueTrinta " + isDentroDaLeiMenorQueTrinta );

        System.out.println("---------------------------------------------");
        System.out.println("---------------------------------------------");

        // || OR
        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlaystation = 5000f;

        boolean isPlaystationCincoCompravel = valorTotalContaCorrente > valorPlaystation || valorTotalContaPoupanca > valorPlaystation;
        System.out.println("isPlaystationCincoCompravel " + isPlaystationCincoCompravel);

        System.out.println("---------------------------------------------");
        System.out.println("---------------------------------------------");

        //  = += -= *= /= %=
        double bonus = 1800; //1800
        System.out.println("Bônus: " + bonus);

        bonus += 1000; // 2800
        System.out.println("Bônus: 1800 + 1000 = " + bonus);

        bonus -= 1000; // 1800
        System.out.println("Bônus: 2800 - 1000 = " + bonus);

        bonus *= 2; // 3600
        System.out.println("Bônus: 1800 * 2 = " + bonus);

        bonus /= 2; // 1800
        System.out.println("Bônus: 3600 / 2 = " + bonus);

        bonus %= 2;
        System.out.println("Bônus: 1800 % 2 = " + bonus);

        System.out.println(bonus);

        // ++ --
        int contador = 0;
        contador += 1;
        contador++;
        contador--;
        ++contador;
        --contador;

        int contador2 = 0;
        System.out.println(++contador2);

    }
}
