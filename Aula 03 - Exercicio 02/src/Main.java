import java.util.Scanner
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Entre com o número de lanches  ");
        int lanche1 = entrada.nextInt();
        System.out.println("Entre com o número de lanches  ");
        int lanche2 = entrada.nextInt();
        System.out.println("Entre com o número de lanches  ");
        int  lanche3 = entrada.nextInt();
        double soma = lanche1 + lanche2 + lanche3;
        double media = (double) soma/3; //(double) pra fazer o casting. Se não quiser fazer o casting pode colocar o número divisor com ponto -> 3.0
        System.out.println("A média é:"+ (media));
    }
}
