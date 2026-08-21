import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o número de alunos matriculados no curso:");
        int a = entrada.nextInt();
       switch (a){
           case 10:
               System.out.println("Localização.: I - 16");
               break;
           case 20:
               System.out.println("Localização.: I - 16");
               break;
           case 30:
               System.out.println("Localização.: I - 22");
               break;
           default:
               System.out.println("ERRO!!!!");
       }
    }
}