package exercicio02;

import java.util.Scanner;

public class Exercicio02 {
    

 public static Scanner input = new Scanner(System.in);
 public static Banda cadastrarBanda() {

    Banda b = new Banda();
        
        System.out.println("Digite o nome da banda: ");
        b.nome = input.nextLine();

        System.out.println("Digite o tipo de Música: ");
        b.tipo = input.nextLine();

        System.out.println("Digite o número de Integrantes: ");
        b.numerodeIntegrantes = input.nextInt();

        System.out.println("Digite a posição no ranking: ");
        b.posicao = input.nextInt();
        
        input.nextLine();
        
        return b;
    }

}