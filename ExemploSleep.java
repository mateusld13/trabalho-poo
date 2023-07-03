import java.util.concurrent.TimeUnit;

public class ExemploSleep {
    public static void main(String[] args) {
        System.out.println("Início do programa");

        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            // e.printStackTrace();
        }

        System.out.println("Fim do programa");
    }
}