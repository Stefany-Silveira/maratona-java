package br.com.stefany.maratonajava.introducao;

//Estruturas Condicionais - Exercício Switch
public class Aula05pt6 {

    public static void main(String[] args) {
        //Utiliznado switch e dados os valores de 1 a 7, imprima se é dia útil ou final de semana
        //Considerando 1 como domingo

        byte dia =1;

        switch (dia) {
            case 1:
                System.out.println("Domingo - final de semana ");
                break;
            case 2:
                System.out.println("Segunda - dia útil");
                break;
            case 3:
                System.out.println("Terça - dia útil");
                break;
            case 4:
                System.out.println("Quarta - dia útil");
                break;
            case 5:
                System.out.println("Quinta - dia útil");
                break;
            case 6:
                System.out.println("Sexta - dua útil");
                break;
            case 7:
                System.out.println("Sábado - final de semana");
            default:
                System.out.println("Opcão inválida");
        }

    }

}
