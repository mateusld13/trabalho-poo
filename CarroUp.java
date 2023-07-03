import java.util.Scanner;
// import java.util.concurrent.TimeUnit;

public class CarroUp {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Produto produto1 = new Produto();

        int at;
        String fabricante;
        String nome;
        String tipo;
        int quantidade;

        System.out.print("Qual deseja atualizar ? :");
        at = scan.nextInt();
        produto1.id = at;

                    // essa porcaria ainda continua a dar erro e não deixa digitar os dados do
                    // fabricante então criei uma variavel "soparapularoerro" apevas
                    // para passar por ela e deixar digitar o fabricante se tirar não deixa digitar 
                    System.out.println("aquivai pular :"); //        System.out.print("Novo fabricante : ");
                    String soparapularoerro = scan.nextLine(); //      fabricante = scan.nextLine();
                    // essa porcaria ainda continua a dar err e não deixa digitar os dados do
                    // fabricante então criei uma variavel apevas
                    // para passar por ela e deixar digitar o fabricante

        System.out.print("Novo fabricante : ");
        fabricante = scan.nextLine();
        produto1.fabricante = fabricante;
        System.out.println("Novo Nome : ");
        nome = scan.nextLine();
        produto1.nome = nome;
        System.out.println("Novo Tipo : ");
        tipo = scan.nextLine();
        produto1.tipo = tipo;
        System.out.println("Nova Quantidade : ");
        quantidade = scan.nextInt();
        produto1.quantidade = quantidade;

        boolean retorno = Database.atualizarRegistro(produto1);
        System.out.println(retorno);

        // Estoque pilha = new Estoque();

        // pilha.id = 1;
        // pilha.filial_id = 2;
        // pilha.produto_id = 42;
        // pilha.quantidade = 1900;

        // System.out.println("-------SELECT-------");
        // System.out.println(pilha.selectSQL());
        // System.out.println("-------INSERT-------");
        // System.out.println(pilha.insertSQL());
        // System.out.println("-------UPDATE-------");
        // System.out.println(pilha.updateSQL());
        // System.out.println("-------DELETE-------");
        // System.out.println(pilha.deleteSQL());

    }
}