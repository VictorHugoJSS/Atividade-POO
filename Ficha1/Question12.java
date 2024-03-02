import java.util.*;

public class Question12{
  public static void main ( String args[] ){
    Scanner scanf = new Scanner(System.in);
    System.out.print("Digite um numero: ");
    int number = scanf.nextInt();
    scanf.close();

    if (number % 2 == 0){
      System.out.println("O numero que foi digitado é par");
    }
    else{
      System.out.println("O numero que foi digitado é impar");
    }
  }
}
