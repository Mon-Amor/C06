import java.util.Random;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Random aleatorio = new Random();
        int numero = aleatorio.nextInt(10) + 1;
        do {
            System.out.println("O número escolhido é: " + (numero) + "? Digite 1 para sim e qualquer numero para não.");
            int confirmacao = entrada.nextInt();
            if (confirmacao == 1) {
                System.out.println("O número escolhido foi: " + (numero));
                break;
            } else {
                numero = aleatorio.nextInt(10) + 1;
                System.out.println("Pensando...");
            }
        } while (true);
    }
}
