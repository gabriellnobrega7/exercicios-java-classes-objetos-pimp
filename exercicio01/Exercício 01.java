import java.util.Scanner;
 
 public class Exercicio02{

    public static Scanner input = new Scanner(System.in);


     public static Banda buscarPorRanking(Banda[] bandas, int posicao) {

        for(int i = 0; i < bandas.length; i++){

            if(bandas[i].posicaoRanking == posicao){

                System.out.println("Banda encontrada");
                return bandas[i];
            }
        }
        System.out.println("Nenhuma banda encontrada nessa posição.");
        return null;
     }

     public static void main(String[] args) {

System.out.println("Digite a quantidade de bandas");
int qtd = input.nextInt();
Banda[] bandas = new Banda[qtd]; 
System.out.print("Digite a posição do ranking: ");
int posicao = input.nextInt();

Banda resultado = buscarPorRanking(bandas, posicao);

if (resultado != null) {
    System.out.println("Nome: " + resultado.nome);
}
     }
 }
