import java.util.Scanner;

public class Question9{
  public static void main (String args[] ){
    String animal;
    Scanner scan = new Scanner(System.in);
    
    animal = scan.nextLine();
    scan.close();

    System.out.printf("O animal digitado foi: %s%n", animal);
  }
}
