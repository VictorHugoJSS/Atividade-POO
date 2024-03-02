import java.util.Scanner;

public class Question14{
    public static void main ( String args[] ){
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite dois numeros: ");
        int firstNumber = scan.nextInt();
        int secondNumber = scan.nextInt();
        scan.close();

        if (firstNumber > secondNumber){
            System.out.printf("O numero %d é o maior%n", firstNumber);
        }
        else{
            System.out.printf("O numero %d é o maior%n", secondNumber);
        }
    }

}