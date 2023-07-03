import java.util.Scanner;

public class CarroLer {
    public static void main(String[] args){
        
        Produto produto1 = new Produto();

        Scanner scan = new Scanner(System.in);

        int ler;

        System.out.println("Qual item deseja visualizar ? :");
        ler = scan.nextInt();

        

        boolean retorno = Database.abrirID(produto1, ler);
        System.out.println(produto1.fabricante + " " + produto1.nome + " " + produto1.tipo + " " + produto1.quantidade);

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