// Q2: String para Int V2
// Recebe um numero em formato de string para Int

import java.util.Scanner;

public class Question2B{
  public static void main ( String args[] ){
    Scanner scanf = new Scanner(System.in);

    System.out.print("Digite a sua idade atual: ");
    String idadeString = scanf.nextLine();
    int idadeInt = Integer.parseInt(idadeString);
    scanf.close();

    System.out.print("Sua idade Atual em int é: ");
    System.out.println(idadeInt);

    System.exit(0);
  }
}
