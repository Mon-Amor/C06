import java.util.Scanner;

public class Apocalipse
{
    static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        boolean retorno;
        ZUMBI Z1 = new ZUMBI();
        ZUMBI Z2 = new ZUMBI();
        System.out.println("Dê nome para os seus zumbis.");
        Z1.darNome();
        Z2.darNome();
        System.out.println("Escolha a quantidade de vida para os seus zumbis.");
        Z1.mostraVida();
        Z2.mostraVida();
        System.out.println("O primeiro zumbi está caindo aos pedaços e seu colega muito caridoso vai tranferir vida pra ele. Digite o valor de vida que deseja compartilhar: ");
        double transferencia = entrada.nextDouble();
        retorno = Z2.tranfereVida(Z2,Z1,transferencia);
        if(retorno == false)
        {
            System.out.println("Não é possível transferir porque o zumbi " +Z2.nome +" não tem vida disponível ou a quantidade informada -> " +transferencia +" é maior que a vida do zumbi que é: " +Z2.vida);
        }
        else
        {
            System.out.println("Segue a troca -> O zumbi doador agora tem " +Z2.vida +" pontos de vida e o zumbi receptor tem " +Z1.vida);
        }
    }
}