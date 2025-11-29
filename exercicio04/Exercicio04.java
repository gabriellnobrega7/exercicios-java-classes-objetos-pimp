 package exercicio04;

public class Exercicio04 {
    
    public static boolean bandaExiste(Banda[] bandas, String nomeBusca) {
        
        for(int i = 0; i < bandas.length; i++){

            if (bandas[i].nome.equalsIgnoreCase(nomeBusca)) {
                return true;
            }

        }
        return false;
    }
}