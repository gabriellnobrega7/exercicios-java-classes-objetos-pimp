  package exercicio05;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio05 {

    public static Scanner input = new Scanner(System.in);

    public static Banda cadastrarBandas() {
        Banda b = new Banda();

        System.out.println("Digite o nome da banda: ");
        b.nome = input.nextLine();

        System.out.println("Digite o tipo de Música: ");
        b.tipo = input.nextLine();

        System.out.println("Digite o número de Integrantes: ");
        b.numerodeIntegrantes = input.nextInt();

        System.out.println("Digite a posição no ranking: ");
        b.posicao = input.nextInt();

        input.nextLine(); // limpar buffer

        return b;
    }

    public static void mostrarBanda(Banda b) {
        System.out.println("Nome da Banda: " + b.nome);
        System.out.println("Tipo de Música: " + b.tipo);
        System.out.println("Integrantes: " + b.numerodeIntegrantes);
        System.out.println("Posição no ranking: " + b.posicao);
    }

    public static Banda buscarPorRanking(ArrayList<Banda> bandas, int posicao) {
        for (Banda b : bandas) {
            if (b.posicao == posicao) {
                return b;
            }
        }
        return null;
    }

    public static ArrayList<Banda> buscarPorTipo(ArrayList<Banda> bandas, String tipo) {
        ArrayList<Banda> resultado = new ArrayList<>();
        for (Banda b : bandas) {
            if (b.tipo.equalsIgnoreCase(tipo)) {
                resultado.add(b);
            }
        }
        return resultado;
    }

    public static boolean bandaExiste(ArrayList<Banda> bandas, String nomeBusca) {
        for (Banda b : bandas) {
            if (b.nome.equalsIgnoreCase(nomeBusca)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Banda> bandas = new ArrayList<>();
        int opcao;

        do {
            System.out.println("\n===== SISTEMA DE GERENCIAMENTO DE BANDAS =====");
            System.out.println("1. Cadastrar banda");
            System.out.println("2. Exibir todas as bandas");
            System.out.println("3. Buscar banda por ranking");
            System.out.println("4. Buscar bandas por tipo");
            System.out.println("5. Verificar se banda existe");
            System.out.println("6. Sair");
            System.out.print("Escolha uma opção: ");

            opcao = input.nextInt();
            input.nextLine(); // limpar buffer

            switch (opcao) {
                case 1:
                    Banda nova = cadastrarBandas();
                    bandas.add(nova);
                    System.out.println("Banda cadastrada com sucesso!");
                    break;

                case 2:
                    if (!bandas.isEmpty()) {
                        for (Banda b : bandas) {
                            mostrarBanda(b);
                            System.out.println("------------------");
                        }
                    } else {
                        System.out.println("Nenhuma banda cadastrada ainda.");
                    }
                    break;

                case 3:
                    if (!bandas.isEmpty()) {
                        System.out.print("Digite a posição do ranking: ");
                        int pos = input.nextInt();
                        input.nextLine();
                        Banda encontrada = buscarPorRanking(bandas, pos);
                        if (encontrada != null) {
                            mostrarBanda(encontrada);
                        } else {
                            System.out.println("Nenhuma banda encontrada nessa posição.");
                        }
                    } else {
                        System.out.println("Nenhuma banda cadastrada ainda.");
                    }
                    break;

                case 4:
                    if (!bandas.isEmpty()) {
                        System.out.print("Digite o tipo de música: ");
                        String tipo = input.nextLine();
                        ArrayList<Banda> resultado = buscarPorTipo(bandas, tipo);
                        if (resultado.isEmpty()) {
                            System.out.println("Nenhuma banda encontrada desse tipo.");
                        } else {
                            for (Banda b : resultado) {
                                mostrarBanda(b);
                                System.out.println("------------------");
                            }
                        }
                    } else {
                        System.out.println("Nenhuma banda cadastrada ainda.");
                    }
                    break;

                case 5:
                    if (!bandas.isEmpty()) {
                        System.out.print("Digite o nome da banda: ");
                        String nome = input.nextLine();
                        if (bandaExiste(bandas, nome)) {
                            System.out.println("A banda '" + nome + "' está no ranking!");
                        } else {
                            System.out.println("A banda '" + nome + "' não está no ranking.");
                        }
                    } else {
                        System.out.println("Nenhuma banda cadastrada ainda.");
                    }
                    break;

                case 6:
                    System.out.println("Saindo do sistema...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 6);

        input.close();
    }
}
