package br.com.stefany.maratonajava.introducao;

//Estruturas condicionais switch casa
public class Aula05pt5 {
    public static void main(String[] args) {
        //Imprima o dia da semana, considerando 1 como domingo

        byte dia = 5;

        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            default:
                System.out.println("Opcão inválida");
        }

        char sexo = 'M';
        switch (sexo) {
            case 'M':
                System.out.println("Homem");
                break;
            case 'F':
                System.out.println("Mulher");
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }
    }
}
