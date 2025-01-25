package filme;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class SeletorDeFilmes {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        Random random = new Random();

        int escolha;
        ArrayList<String> filmes = new ArrayList<>();

        do {
            System.out.println("\n===== Menu Filmes =====");
            System.out.println("1. Cadastrar Filme");
            System.out.println("2. Listar Filmes");
            System.out.println("3. Excluir opção");
            System.out.println("4. Sortear um filme");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            escolha = a.nextInt();
            a.nextLine();

            switch (escolha){
                case 1:
                    //Cadastrar e perguntar se necessita adicionar mais algum
                    String continuar;
                    while (true){
                        System.out.println("Qual filme deseja adicionar? ");
                        filmes.add(a.nextLine());

                        System.out.println("Deseja cadastrar outro filme? (s/n)");
                        continuar = a.nextLine().toLowerCase();
                        if (continuar.equals("n")) {
                            break;
                        }else if (!continuar.equals("s")){
                            System.out.println("Opção invalida tente novamente...(s/n)");
                        }
                    }
                    break;
                case 2:
                    //Listar filmes
                    if(filmes.isEmpty()){
                        System.out.println("A lista está vazia...");
                    }else {
                        System.out.println("=============== Lista de filmes ================");
                        for (int i = 0; i < filmes.size(); i++) {
                            System.out.println(filmes.get(i));
                        }

                    }
                    break;

                case 3:
                    //exclusão
                    if(filmes.isEmpty()){
                        System.out.println("A lista está vazia...");
                    }else {
                        System.out.println("===== Exclusão de filmes =====");
                        while (true){
                            for (int i = 0; i < filmes.size(); i++) {
                                System.out.println((i + 1) + " " + filmes.get(i));
                            }

                            System.out.println("Qual filme deseja excluir? ");
                            int filmeExclusao = a.nextInt();
                            a.nextLine();
                            filmes.remove(filmeExclusao-1);

                            System.out.println("Deseja excluir mais algum filme? (s/n)");
                            continuar = a.nextLine().toLowerCase();
                            if(continuar.equals("n")){
                                break;
                            } else if (!continuar.equals("s")) {
                                System.out.println("Opção invalida tente novamente...(s/n)");
                            }
                        }
                        }
                    break;
                case 4:
                    //Randomizar filmes
                    if(filmes.isEmpty()){
                        System.out.println("A lista está vazia...");
                    }else {
                        int indice = random.nextInt(filmes.size());
                        System.out.println("O filme sorteado é: " +filmes.get(indice));

                    }
                    break;
                case 5:
                        System.out.println("Saindo do programa...");
                        break;
                default:
                         System.out.println("Opção invalida, tente novamente...");
                         break;
            }
        }while (escolha != 5);
    }
}
