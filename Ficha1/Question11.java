import java.util.Scanner;

public class Question11{
  public static void main ( String args[] ){
    Scanner scanf = new Scanner(System.in);

    System.out.print("Digite algo aqui: ");
    
    String v = scanf.nextLine();
    int size = v.length();
    scanf.close();

    System.out.printf("O tamanho da string que voce digitou foi: %d%n", size);
    
  }
}
