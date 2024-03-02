import java.util.Scanner;

public class Question21{

    public static void main (String args[]){
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um numero decimal: ");
        double numberDouble = scan.nextDouble();
        scan.close();

        int numberInt = (int) numberDouble;
        
        System.out.println("O numero digitado na forma int é: " + numberInt);
    }   

}