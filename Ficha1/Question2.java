// Q2: String para Int
// Recebe um numero em formato de string para int

import java.util.Scanner;

public class Question2{
  public static void main (String args[]){
    Scanner scanf = new Scanner(System.in);

    System.out.print("Digite a sua Idade atual: ");
    int idadeInt = scanf.nextInt();
    scanf.close();

    System.out.print("Sua idade Atual em int é: ");
    System.out.println(idadeInt);
    System.exit(0);
  }
}
