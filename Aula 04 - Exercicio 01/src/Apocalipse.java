import java.util.Scanner;

public class Apocalipse
{
    static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        ZUMBI Z1 = new ZUMBI();
        Z1.vida = 10;
        Z1.mordidas = 0;
        System.out.println("O zumbi primordial tem " + Z1.vida + " de vida e já mordeu " +Z1.mordidas +" pessoas. A cada mordida o zumbi infecta uma pessoa e perde 2 pontos de vida. Entre 1 a 5, digite quantas mordidas o zumbi vai dar.");
        int a = entrada.nextInt();
        for (int i = 0; i < a; i++)
        {
            Z1.ATACAR();
        }
        System.out.println("Depois do ataque, o zumbi primordial tem "+Z1.vida + " de vida e já mordeu " +Z1.mordidas + " pessoas. O numero de infectados é: " +Z1.infectados);
        if(Z1.vida == 0)
        {
           System.out.println("A vida do zumbi primordial chegou a zero e ele morreu. FIM!");
        }
    }
}