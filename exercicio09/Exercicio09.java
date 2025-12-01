 package exercicio09;

public class Exercicio09 {
    
    public static void selectionSort(Banda[] bandas) {
        
        for(int i = 0; i < bandas.length; i++){
            int indiceMinimo = i;
        

            for(int j = i + 1; j < bandas.length; j++){
                if(bandas[j].posicao < bandas[indiceMinimo].posicao){
                    indiceMinimo = j;
                }
        }
        if(i != indiceMinimo){
            Banda aux = bandas[i];
            bandas[i] = bandas[indiceMinimo];
            bandas[indiceMinimo] = aux;

        }
    }
    }

     public static void selectionSortDecrescente(Banda[] bandas) {
        // TODO: Implemente sua solução aqui
        // Dica: Similar ao crescente, mas procure o MAIOR elemento

        for(int i = 0; i < bandas.length; i++){
            int indiceMaximo = i;        

            for(int j = i + 1; j < bandas.length; j++){
                if(bandas[j].posicao > bandas[indiceMaximo].posicao){
                    indiceMaximo = j;
                }
            }

            if(i != indiceMaximo){
                Banda aux = bandas[i];
                bandas[i] = bandas[indiceMaximo];
                bandas[indiceMaximo] = aux;
            }
    }
     }

     public static void selectionSortPorNome(Banda[] bandas) {
        // TODO: Implemente sua solução aqui
        // Dica: Use compareTo() para comparar strings
        // exemplo: if (bandas[j].nome.compareTo(bandas[indiceMinimo].nome) < 0)

        
        for(int i = 0; i < bandas.length; i++){
            int indiceMinimo = i;        

            for(int j = i + 1; j < bandas.length; j++){
                if(bandas[j].nome.compareTo(bandas[indiceMinimo].nome) < 0){
                    indiceMinimo = j;
                }
            }

            if(i != indiceMinimo){
                Banda aux = bandas[i];
                bandas[i] = bandas[indiceMinimo];
                bandas[indiceMinimo] = aux;
            }
    }

    }

     public static void selectionSortPorRanking(Banda[] bandas) {
        
        for(int i = 0; i < bandas.length; i++){
            int indiceMinimo = i;

            for(int j = i + 1; j < bandas.length; j++){
                if(bandas[j].posicao < bandas[indiceMinimo].posicao){
                    indiceMinimo = j;
                }
            }
            if(i != indiceMinimo){
                Banda aux = bandas[i];
                bandas[i] = bandas[indiceMinimo];
                bandas[indiceMinimo] = aux;
            }
        }

    }

    public static int[] selectionSortComContador(Banda[] bandas) {
        // TODO: Implemente sua solução aqui
        // Mantenha dois contadores: comparacoes e trocas
         int comp = 0;
         int troca = 0;
         for(int i = 0; i < bandas.length; i++){
            int indiceMinimo = i;
           
            for(int j = i + 1; j < bandas.length; j++){
                comp++;
                if(bandas[j].posicao < bandas[indiceMinimo].posicao){
                    indiceMinimo = j;
                }
            }
            if(i != indiceMinimo){
                Banda aux = bandas[i];
                bandas[i] = bandas[indiceMinimo];
                bandas[indiceMinimo] = aux;
                troca++;
            }
        }
        return new int[]{comp, troca}; 
    }

    public static boolean estaOrdenado(Banda[] bandas) {
        // TODO: Implemente sua solução aqui
        // Dica: Percorra o array verificando se cada elemento é <= ao próximo

        for(int i = 0; i < bandas.length - 1; i++){

                if(bandas[i].posicao > bandas[i+1].posicao){
                  return false;
                
            }
        }
        
        return true;
    }

    public static int encontrarPosicaoOrdenada(Banda[] bandas, int numeroIntegrantes) {
    for (int i = 0; i < bandas.length; i++) {
        if (numeroIntegrantes < bandas[i].numerodeIntegrantes) {
            return i; // posição correta para inserir
        }
    }
    // se nenhum for maior, inserir no final
    return bandas.length;
}

    public static void trocar(Banda[] bandas, int i, int j) {
        Banda temp = bandas[i];
        bandas[i] = bandas[j];
        bandas[j] = temp;
    }


    



}
