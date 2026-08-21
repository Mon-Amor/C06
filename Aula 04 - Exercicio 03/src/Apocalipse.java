import java.util.Scanner;

public class Apocalipse
{
    static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        ZUMBI Z1 = new ZUMBI();
        ZUMBI Z2 = new ZUMBI();
        System.out.println("Dê nome para os seus zumbis.");
        Z1.darNome();
        Z2.darNome();
        System.out.println("Escolha a quantidade de vida para os seus zumbis.");
        Z1.mostraVida();
        Z2.mostraVida();
        //System.out.println("O primeiro zumbi está caindo aos pedaços e seu colega muito caridoso vai tranferir vida pra ele. Digite o valor contanto que seja menor ou igual a: "+Z2.vida);
        //double transferencia = entrada.nextDouble();
        //Z2.tranfereVida(Z1,transferencia);
        //System.out.println("Segue a troca -> O zumbi doador agora tem " +Z2.vida +" pontos de vida e o zumbi receptor tem " +Z1.vida);
        System.out.println("Aconteceu um milagre no meio do apocalipse. Digite um para vivenciar");
        int milagre = entrada.nextInt();
        if(milagre == 1)
        {
          Z1 = Z2;
        }
        System.out.println("Digite uma nova vida para o primeiro zumbi: ");
        Z1.mostraVida();
        System.out.println("PARABÉNS, você ganhou dois em um -> O primeiro zumbi agora tem " +Z1.vida +" pontos de vida e o segundo zumbi tem " +Z2.vida);
    }
}