import java.util.Scanner;

public class Question20{

    public static void main (String args[]){
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite dois numeros decimais: ");
        double firstNumber = scan.nextDouble();
        double secondNumber = scan.nextDouble();
        scan.close();

        double resto = firstNumber % secondNumber;

        System.out.printf("O resto da divisão entre esse dois numeros é: %.0f%n", resto);
    }   

}