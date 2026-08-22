import java.util.Scanner;

public class ZUMBI
{
    Scanner entrada = new Scanner(System.in);
    double vida;
    double transferencia;
    String nome;
    void mostraVida()
    {
        vida = entrada.nextDouble();
        System.out.println("A vida do zumbi " +nome +" é: " +vida);
    }
    void darNome()
    {
        System.out.println("Digite o nome do zumbi:");
        nome = entrada.nextLine();
        System.out.println("O zumbi se chama.: " +nome);
    }
    boolean tranfereVida(ZUMBI origem, ZUMBI destino, double quantia)
    {
        if (origem.vida <= 0.0 || quantia > origem.vida)
        {
            return false;
        }
        else
        {
            origem.vida -= quantia;
            destino.vida += quantia;
            return true;
        }
    }
}
