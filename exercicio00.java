import java.util.Scanner;
 
 public class Exercicio00{

    public static Scanner input = new Scanner(System.in);

    public static void criarBanda(Banda b){

        System.out.println("Digite o nome da banda: ");
        b.nome = input.nextLine();

        System.out.println("Digite o tipo de Música: ");
        b.tipodeMusica = input.nextLine();

        System.out.println("Digite o número de Integrantes: ");
        b.numerodeIntegrantes = input.nextInt();

        System.out.println("Digite a posição no ranking: ");
        b.posicao = input.nextInt();
        
        input.nextLine();
      }

      public static void imprimirBanda(Banda dejavu){

        System.out.println("Nome da banda: " + dejavu.nome);
        System.out.println("Tipo de música: " + dejavu.tipodeMusica);
        System.out.println("Número de Integrantes: " + dejavu.numerodeIntegrantes);
        System.out.println("Posição: "  + dejavu.posicao + "°");
      }

    public static void main(String[] args) {
        Banda b = new Banda();
        criarBanda(b);
        imprimirBanda(b);
    }
 }