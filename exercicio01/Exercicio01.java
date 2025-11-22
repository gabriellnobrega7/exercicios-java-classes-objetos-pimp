 package exercicio01;

import java.util.Scanner;

public class Exercicio01 {
    
    public static Scanner input = new Scanner(System.in);

    public static Banda[] criarArrayDeBandas(String[] nome, String[] tipodeMusica, 
                                             int[] numerodeIntegrantes, int[] posicao) {
       
        Banda[] bandas = new Banda[nome.length];

        for (int i = 0; i < nome.length; i++) {
            bandas[i] = new Banda();

            bandas[i].nome = nome[i];
            bandas[i].tipodeMusica = tipodeMusica[i];
            bandas[i].numerodeIntegrantes = numerodeIntegrantes[i];
            bandas[i].posicao = posicao[i];
        }
        return bandas;
    }

    public static void imprimir(Banda b){

        System.out.println("Nome da Banda: " + b.nome);
        System.out.println("Tipo de Música: " + b.tipodeMusica);
        System.out.println("Integrantes: " + b.numerodeIntegrantes);
        System.out.println("Posição no ranking: " + b.posicao);

    }

    public static void main(String[] args) {
        

        System.out.println("Digite o número de bandas que você irá cadastrar: ");
        int qtd = input.nextInt();
        input.nextLine(); 

        String[] nome = new String[qtd];
        String[] tipodeMusica = new String[qtd];
        int[] numerodeIntegrantes = new int[qtd];
        int[] posicao = new int[qtd];

        Banda[] bandas = criarArrayDeBandas(nome, tipodeMusica, numerodeIntegrantes, posicao);

        System.out.println("\n---- IMPRESSÃO DOS PRODUTOS----");
         for(int i = 0; i < bandas.length; i++){
            System.out.println("Produto  " + (i + 1)+ " :");
            imprimir(bandas[i]);
         }
    }
}
