import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Random aleatorio = new Random();
        int menor = 1;
        int maior = 10;
        while (true) {
            int numero = aleatorio.nextInt(maior - menor + 1) + menor;
            System.out.println("O número escolhido é " + numero + "? Digite 1 para sim e qualquer número para não.");
            int confirmacao = entrada.nextInt();
            if (confirmacao == 1) {
                System.out.println("Acertei! O número escolhido foi: " + numero);
                break;
            }
            System.out.println("O número mostrado é maior ou menor que o número escolhido? Digite 1 para MAIOR e qualquer número para MENOR.");
            int confirmacao2 = entrada.nextInt();
            if (confirmacao2 == 1)
            {
                maior = numero - 1;
            }
            else
            {
                menor = numero + 1;
            }
            System.out.println("Intervalo atual: " + menor + " até " + maior);
            if (menor > maior) {
                System.out.println("As respostas fornecidas são inconsistentes.");
                break;
            }
        }
        entrada.close();
    }
}