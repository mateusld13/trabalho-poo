import java.util.Scanner;

public class SQLFactory {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Produto produto1 = new Produto();

        int id;
        int contador = 1;
        String fabricante;
        String nome;
        String tipo;
        int quantidade;

        String soparapularoerro;

        int escolha = 0;
        do {
            System.out.println("Escolha uma opção:"); // Imprimir o menu na tela
            System.out.println("1 - C_reate ");
            System.out.println("2 - R_ead ");
            System.out.println("3 - U_pdate ");
            System.out.println("4 - D_elete ");
            System.out.println("0 - S_air");
            escolha = scan.nextInt();
            if (escolha == 1) {
                // System.out.println("Você escolheu a opção 1.");

                // produto1.id = contador;
                // essa porcaria ainda continua a dar erro e não deixa digitar os dados do
                // fabricante então criei uma variavel "soparapularoerro" apevas
                // para passar por ela e deixar digitar o fabricante se tirar não deixa digitar
                System.out.println(" "); // System.out.print("Novo fabricante : ");
                soparapularoerro = scan.nextLine(); // fabricante = scan.nextLine();
                // essa porcaria ainda continua a dar err e não deixa digitar os dados do
                // fabricante então criei uma variavel apevas
                // para passar por ela e deixar digitar o fabricante
                produto1.id = contador;
                System.out.println("Digite as informações dos veiculos");
                System.out.println("");
                System.out.print("Fabricante : ");
                fabricante = scan.nextLine();
                produto1.fabricante = fabricante;
                System.out.print("Nome : ");
                nome = scan.nextLine();
                produto1.nome = nome;
                System.out.print("Tipo : ");
                tipo = scan.nextLine();
                produto1.tipo = tipo;
                System.out.print("Quantidade : ");
                quantidade = scan.nextInt();
                produto1.quantidade = quantidade;

                boolean retorno = Database.inserirRegistro(produto1);
                System.out.println(retorno);
                contador = contador + 1;
            } else if (escolha == 2) {
                // System.out.println("Você escolheu a opção 2.");

                int ler;

                System.out.println("Qual item deseja visualizar ? :");
                System.out.println("");
                ler = scan.nextInt();

                boolean retorno = Database.abrirID(produto1, ler);
                System.out.println(
                        produto1.fabricante + " " + produto1.nome + " " + produto1.tipo + " " + produto1.quantidade);
                        System.out.println("");
            } else if (escolha == 3) {
                // System.out.println("Você escolheu sair.");
                System.out.print("Qual deseja atualizar ? :");
                int at = scan.nextInt();
                produto1.id = at;

                // essa porcaria ainda continua a dar erro e não deixa digitar os dados do
                // fabricante então criei uma variavel "soparapularoerro" apevas
                // para passar por ela e deixar digitar o fabricante se tirar não deixa digitar
                System.out.println(""); // System.out.print("Novo fabricante : ");
                soparapularoerro = scan.nextLine(); // fabricante = scan.nextLine();
                // essa porcaria ainda continua a dar err e não deixa digitar os dados do
                // fabricante então criei uma variavel apevas
                // para passar por ela e deixar digitar o fabricante

                System.out.print("Novo fabricante : ");
                fabricante = scan.nextLine();
                produto1.fabricante = fabricante;
                System.out.print("Novo Nome : ");
                nome = scan.nextLine();
                produto1.nome = nome;
                System.out.print("Novo Tipo : ");
                tipo = scan.nextLine();
                produto1.tipo = tipo;
                System.out.print("Nova Quantidade : ");
                quantidade = scan.nextInt();
                produto1.quantidade = quantidade;

                boolean retorno = Database.atualizarRegistro(produto1);
                System.out.println(retorno);

            } else if (escolha == 4) {
                // System.out.println("Opção inválida.");
                int excluir = 0;

                System.out.println("QUAL ITEM DESEJA EXCLUIR ? :");
                excluir = scan.nextInt();

                produto1.id = excluir;

                boolean retorno = Database.deletarRegistro(produto1);
                System.out.println(retorno);
            } else {
                System.out.println("Opção inválida.");
            }
        } while (escolha != 0);

    }
}