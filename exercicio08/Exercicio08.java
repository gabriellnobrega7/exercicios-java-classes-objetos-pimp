 package exercicio08;

public class Exercicio08 {
    
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


     public static int calcularTotalIntegrantes(Banda[] bandas) {
        if(bandas == null || bandas.length == 0){
            return 0;
        }

        int total = 0;
    for (int i = 0; i < bandas.length; i++) {
         total += bandas[i].numerodeIntegrantes;
    }
    return total;


    }

    public static Banda encontrarBandaMaisProximaDaMedia(Banda[] bandas) {
    if (bandas == null || bandas.length == 0) {
        return null;
    }

    double media = calcularMediaIntegrantes(bandas);

    Banda maisProxima = bandas[0];
    double menorDistancia = Math.abs(bandas[0].numerodeIntegrantes - media);

    for (int i = 1; i < bandas.length; i++) {
        double distancia = Math.abs(bandas[i].numerodeIntegrantes - media);
        if (distancia < menorDistancia) {
            menorDistancia = distancia;
            maisProxima = bandas[i];
        }
    }
    return maisProxima;
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

    public static String gerarRelatorioEstatistico(Banda[] bandas) {
        if (bandas == null || bandas.length == 0) {
        return "Nenhuma banda cadastrada.";
    }
        // === RELATÓRIO ESTATÍSTICO ===
        // Total de bandas: 5
        // Total de integrantes: 22
        // Média de integrantes: 4.4
        // Mediana: 4.0
        // Acima da média: 2 bandas
        // Abaixo da média: 1 banda
        int totaldeBandas = bandas.length;

        int total = calcularTotalIntegrantes(bandas);

        double media = calcularMediaIntegrantes(bandas);
        
        double mediana = calcularMedianaIntegrantes(bandas);

        int acimaDaMedia = contarBandasAcimaDaMedia(bandas);

        int abaixoDaMedia = contarBandasAbaixoDaMedia(bandas);

        String relatorio = "";
    relatorio += "=== RELATÓRIO ESTATÍSTICO ===\n";
    relatorio += "Total de bandas: " + totaldeBandas + "\n";
    relatorio += "Total de integrantes: " + total + "\n";
    relatorio += "Média de integrantes: " + media + "\n";
    relatorio += "Mediana: " + mediana + "\n";
    relatorio += "Bandas acima da média: " + acimaDaMedia + "\n";
    relatorio += "Bandas abaixo da média: " + abaixoDaMedia + "\n";
    
        return relatorio;
    }



}
