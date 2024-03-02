import java.util.*;

public class Question13{
    public static void main ( String args[] ){
        Scanner scanf = new Scanner(System.in);

        System.out.print("Digite um numero inteiro: ");
        int number = scanf.nextInt();
        scanf.close();

        if (number > 0){
            System.out.println("O numero que voce digitou é positivo");
        }
        else{
            System.out.println("O numero que você digitou é negativo");
        }
    }
}
