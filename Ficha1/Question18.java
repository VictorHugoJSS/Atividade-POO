import java.util.Scanner;

public class Question18{
    public static void main (String args[]){
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Digite a base do retangulo");
        double base = scan.nextDouble();
        System.out.print("Digite a altura do retangulo");
        double altura = scan.nextDouble();
        scan.close();

        double area = base * altura;

        System.out.printf("A area do retangulo: %.3f m%n", area);
    }
} 