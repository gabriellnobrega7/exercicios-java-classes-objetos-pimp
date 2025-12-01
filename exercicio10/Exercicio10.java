 package exercicio10;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio10 {
    
    public static Scanner input = new Scanner(System.in);
     public static int qtdBandas = 0;

     public static int calcularTotalIntegrantes(Banda[] bandas) {
        if(bandas == null || bandas.length == 0){
            return 0;
        }

        int total = 0;
    for (int i = 0; i < qtdBandas; i++) {
         total += bandas[i].numerodeIntegrantes;
    }
    return total;


    }

     public static double calcularMediaIntegrantes(Banda[] bandas) {
         if (bandas == null || bandas.length == 0) {
        return 0.0;
    }

    int soma = 0;
     for (int i = 0; i < bandas.length; i++) {
        soma += bandas[i].numerodeIntegrantes;
    }
    double media = soma / bandas.length;
        return media; 
    }

    public static  void  cadastrarBanda() {

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
        
        System.out.println("Banda cadastrada com sucesso! ");
    }

    public static void mostrarBanda(Banda b){

        System.out.println("Nome da Banda: " + b.nome);
        System.out.println("Tipo de Música: " + b.tipo);
        System.out.println("Integrantes: " + b.numerodeIntegrantes);
        System.out.println("Posição no ranking: " + b.posicao);

    }

    public static int buscarBandapeloNome(Banda[] bandas, String nomeBanda){

        for(int i = 0; i < bandas.length; i++){
            if(bandas[i].nome.equalsIgnoreCase(nomeBanda)){
                return i;
            }
        }
        return -1;
    }

    public static ArrayList<Banda> buscaSequencialporTipo(Banda[] bandas, String tipo){
        ArrayList<Banda> resultado = new ArrayList<>();
        for(int i = 0; i < qtdBandas; i++){
            if(bandas[i].tipo.equalsIgnoreCase(tipo)) resultado.add(bandas[i]);
        }
        return resultado;
    }

    public static void SelectionSort(Banda[] bandas){

        for(int i = 0; i < bandas.length - 1; i++){
            int indiceMinimo = i;
            
            for(int j = i + 1; j < bandas.length; j++){

                if (bandas[j].posicao < bandas[indiceMinimo].posicao) {
                    indiceMinimo = j;
                }
            }
            if (i != indiceMinimo) {
                Banda aux = bandas[i];
                bandas[i] = bandas[indiceMinimo];
                bandas[indiceMinimo] = aux;
            }
        }

    }

     public static Banda encontrarMaiorBanda(Banda[] bandas) {
        
        if(bandas == null || bandas.length == 0){
            return null;
        }

        Banda maior = bandas[0];

        for(int i = 1; i < bandas.length; i++){
            if(bandas[i].numerodeIntegrantes > maior.numerodeIntegrantes){
                maior = bandas[i];
            }
        }
        return maior; 
    }

     public static Banda encontrarMenorBanda(Banda[] bandas) {
        
        if (bandas == null || bandas.length == 0) {
            return null;
        }        

        Banda menor = bandas[0];
        for(int i = 1; i < bandas.length; i++){
            if (bandas[i].numerodeIntegrantes < menor.numerodeIntegrantes) {
                menor = bandas[i];
            }
        }

        return menor; 
    }


    public static double calcularMedianaIntegrantes(Banda[] bandas) {
        
        // Dica 1: Extraia os números de integrantes para um array separado
        // Dica 2: Ordene esse array (pode usar Arrays.sort())
        // Dica 3: Se tamanho é ímpar, retorne o elemento do meio
        // Dica 4: Se tamanho é par, retorne a média dos dois elementos centrais


        if(bandas == null || bandas.length == 0){
            return 0.0;
        }

        int[] integrantes = new int[bandas.length];

        for(int i = 0; i < bandas.length; i++){
            integrantes[i] = bandas[i].numerodeIntegrantes;
        }
        for (int i = 0; i < integrantes.length - 1; i++) {
            for (int j = i + 1; j < integrantes.length; j++) {
                if (integrantes[i] > integrantes[j]) {
                int temp = integrantes[i];
                integrantes[i] = integrantes[j];
                integrantes[j] = temp;
        }
    }
}

    if(integrantes.length % 2 != 0){
        return integrantes[integrantes.length / 2];
    }
    else{
        return (integrantes[integrantes.length/ 2 - 1] + integrantes[integrantes.length/ 2]) / 2;
    }
    }

    public static int contarBandasAcimaDaMedia(Banda[] bandas) {
        
        double media = calcularMediaIntegrantes(bandas);
        
        int cont = 0;

        for(int i = 0; i < bandas.length; i++){

            if(bandas[i].numerodeIntegrantes > media){
                cont++;
            }
            
        }
        
        return cont; 
    }

    public static int contarBandasAbaixoDaMedia(Banda[] bandas) {
        
        double media = calcularMediaIntegrantes(bandas);
        
        int cont = 0;

        for(int i = 0; i < bandas.length; i++){

            if(bandas[i].numerodeIntegrantes < media){
                cont++;
            }
            
        }
        
        return cont; 
    }

    public static String gerarRelatorioestatistico(Banda[] bandas){

        if(bandas == null || bandas.length == 0){
            return ("Nenhuma banda cadastrada");
        }
        int total = calcularTotalIntegrantes(bandas);
        int totaldeBandas = bandas.length;
        double media = calcularMediaIntegrantes(bandas);
        double mediana =  calcularMedianaIntegrantes(bandas);
        int acimaDaMedia = contarBandasAcimaDaMedia(bandas);
        int abaixoDaMedia = contarBandasAbaixoDaMedia(bandas);

        String relatorio = " ";

        relatorio += "Total de bandas: " + totaldeBandas +"\n";
        relatorio += "Total de Integrantes: " + total +"\n";
        relatorio += "Média de integrantes: " + media + "\n";
        relatorio += "Mediana: " + mediana + "\n";
        relatorio += "Bandas acima da média: " + acimaDaMedia + "\n";
        relatorio += "Bandas abaixo da média: " + abaixoDaMedia + "\n";
    
        return relatorio;
    }

    public static void main(String[] args) {
        
        Banda[] bandas = new Banda[10];

        int opcao;

        do{

            System.out.println("---MENU---");
            System.out.println("Opção 1: Cadastrar Bandas");
            System.out.println("Opção 2: Exibir as bandas");
            System.out.println("Opção 3: Buscar banda pelo nome");
            System.out.println("Opção 4: Buscar banda pelo tipo de música");
            System.out.println("Opção 5: Ordenar Bandas");
            System.out.println("Opção 6: Relatório de estatística");
            System.out.println("Opção 7: Encontrar a maior e menor banda");
            System.out.println("Opção 0: SAIR");
            System.out.println();

            System.out.println("Selecione a opção: ");
            opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    cadastrarBanda();
                    break;
            
                case 2: 

                 if(qtdBandas > 0){
                        for(int i = 0; i < qtdBandas; i++){
                            mostrarBanda(bandas[i]);
                            System.out.println("------------------");
                        }
                    } else {
                        System.out.println("Nenhuma banda cadastrada ainda.");
                    }
                    break;

                case 3:

                System.out.println("Digite o nome da banda: ");
                    String nome = input.nextLine();
                    int indice = buscarBandapeloNome(bandas, nome);
                    if(indice != -1){
                        mostrarBanda(bandas[indice]);
                    } else {
                        System.out.println("Banda não encontrada.");
                    }
                    break;

                case 4:
                   System.out.println("Digite o tipo da banda: ");
                   String tipo = input.nextLine();
                   ArrayList<Banda> resultado = buscaSequencialporTipo(bandas, tipo);

                if(resultado != null && !resultado.isEmpty()){
                for(Banda b : resultado){
            mostrarBanda(b);
            System.out.println("------------------");
            }
            } else {
        System.out.println("Nenhuma banda encontrada deste tipo.");
    }
                break;

                case 5: 

                SelectionSort(bandas);
                break;

                case 6: 

                gerarRelatorioestatistico(bandas);

                case 7: 
                Banda Maior = encontrarMaiorBanda(bandas);
                System.out.println("Banda maior: " + Maior);
                System.out.println();
                Banda Menor = encontrarMenorBanda(bandas);
                System.out.println("Banda Menor: " + Menor);
                break;

                case 0: 

                System.out.println("Saindo do menu...");
                break;

                default:
                    System.out.println("Solicitação não encontrada");
                    break;
            }

        } while(opcao != 0);


    }



    }


