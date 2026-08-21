import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Entre com a NPA: ");
        float NPA = entrada.nextFloat();
        if(NPA >=60)
        {
            System.out.println("Aprovado.");
        }
        else
        {
            if(NPA<30)
            {
                System.out.println("Reprovado direto.");
            }
            else
            {
            System.out.println("Fazer a NP3.");
            System.out.println("Entre com a NP3: ");
            float NP3 = entrada.nextFloat();
            float total = (NPA + NP3)/2;
            if(total >= 50)
            {
                System.out.println("Aprovado.");
            }
            else
            {
                System.out.println("Reprovado.");
            }
            }
        }
        entrada.close();
    }
}