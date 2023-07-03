import java.util.Scanner;
public class CarroDel {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Produto produto1 = new Produto();

        int excluir = 0;

        System.out.println("QUAL ITEM DESEJA EXCLUIR ? :");
        excluir = scan.nextInt();

        produto1.id = excluir;

        boolean retorno = Database.deletarRegistro(produto1);
        System.out.println(retorno);
    }
}