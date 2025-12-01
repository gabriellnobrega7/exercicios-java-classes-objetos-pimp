  package exercicio07;

public class Exercicio07 {
    
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

     
    //Encontrar a banda com o maior numero de integrantes:
    public static int encontrarMaximoIntegrantes(Banda[] bandas) {
          
        Banda maior = bandas[0];
        for(int i = 1; i< bandas.length; i++){
            if(bandas[i].numerodeIntegrantes > maior.numerodeIntegrantes){
                maior = bandas[i];
                System.out.println("Banda maior: " + bandas[i].nome);
            }
        }
        
        return maior.numerodeIntegrantes; 
    }

    //Encontrar a banda com o menor número de Integrantes: 

     public static int encontrarMinimoIntegrantes(Banda[] bandas) {

         Banda menor = bandas[0];
        for(int i = 1; i< bandas.length; i++){
            if(bandas[i].numerodeIntegrantes > menor.numerodeIntegrantes){
                menor = bandas[i];
                System.out.println("Banda maior: " + bandas[i].nome);
            }
        }
        return menor.numerodeIntegrantes;
    }

    //Encontrar a banda maior e a banda menor em um array:

     public static Banda[] encontrarMinMax(Banda[] bandas) {
        
        if (bandas == null || bandas.length == 0) {
        return null;
    }
        
        Banda min = bandas[0];
        Banda max = bandas[0];

        for(int i = 1; i < bandas.length; i++){
            if(bandas[i].numerodeIntegrantes > max.numerodeIntegrantes){
                max= bandas[i];
            }
            else if(bandas[i].numerodeIntegrantes < min.numerodeIntegrantes){
                min = bandas[i];
            }
        }
        
        return new Banda[]{min, max}; 
    }

}
