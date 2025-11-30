 package exercicio06;

import java.util.Scanner;

public class Exercicio06 {
    public static Scanner input = new Scanner(System.in);
    //Caso queira mostrar a banda ( nome): 
    public static Banda buscaSequencial(Banda[] bandas, String nomeBanda){

        for(int i = 0; i < bandas.length; i++){

            if(bandas[i].nome.equalsIgnoreCase(nomeBanda)){

                return bandas[i];
            }
        }
        return null;

    }

    //Caso queira mostrar o indice da banda onde foi encontrada:
/*
    public static int buscaSequencial(Banda[] bandas, String nomeBanda){

        for(int i = 0; i < bandas.length; i++){
            if(bandas[i].nome.equalsIgnoreCase(nomeBanda)){
                return i;
            }
        }
        return -1;
    }

} */

    //Busca Sequencial com contador:
/* 
    public static int[] buscaSequencialComContador(Banda[] bandas, String nomeBanda) {
        // Dica: Use um contador que incrementa a cada comparação
        // Retorne um array: [índice_encontrado, total_de_comparações]

        int cont = 0;
        for(int i = 0; i < bandas.length; i++){
            cont++;
            if(bandas[i].nome.equalsIgnoreCase(nomeBanda)){
                return new int[]{i, cont};
            }
        }
        
        return new int[]{-1, cont};
    }
*/
    //Busca Sequencial - todas as ocorrências de bandas com X número de integrantes:

   public static int[] buscaTodasOcorrencias(Banda[] bandas, int numeroIntegrantes) {

    int cont = 0;
    for (int i = 0; i < bandas.length; i++) {
        if (bandas[i].numerodeIntegrantes == numeroIntegrantes) {
            cont++;
        }
    }

    if (cont == 0) {
        return new int[0];
    }

    int[] indices = new int[cont];
    int pos = 0;
    for (int i = 0; i < bandas.length; i++) {
        if (bandas[i].numerodeIntegrantes == numeroIntegrantes) {
            indices[pos] = i;
            pos++;
        }
    }

    return indices;
}

}