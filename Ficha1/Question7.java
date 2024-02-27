// Q7: name and last name
// Leia o nome e sobrenome em seguida Exiba o nome completo

import java.util.Scanner;

public class Question7{
  public static void main ( String args[] ){
    String name,
           lastName,
           completeName;
    Scanner scan = new Scanner(System.in);
    System.out.print("Digite o seu primeiro nome: ");
    name = scan.nextLine();
    System.out.print("Digite o Seu sobrenome: ");
    lastName = scan.nextLine();
    scan.close();
    completeName = name + " " + lastName;

    System.out.printf("O seu nome completo é: %s%n", completeName);
    System.exit(0);
  }
}
