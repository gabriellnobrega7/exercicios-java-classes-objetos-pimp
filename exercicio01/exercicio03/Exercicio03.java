 import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio03 {
    
    public static Scanner input = new Scanner(System.in);

    public static ArrayList<Banda> buscarPorTipo(Banda[] bandas, String tipo) {
        
        ArrayList<Banda> resultado = new ArrayList<>();
        for(int i = 0; i < bandas.length; i++){

            if(bandas[i].tipo.equalsIgnoreCase(tipo)){
                resultado.add(bandas[i]);
            }
        }
        return resultado; 
    }

    public static void main(String[] args) {
        
    Banda[] bandas = {
        new Banda("Queen", "Rock"),
        new Banda("ABBA", "Pop"),
        new Banda("Nirvana", "Rock")
    };

    ArrayList<Banda> rock = buscarPorTipo(bandas, "Rock");

    System.out.println(rock);
}
}
