import java.util.Scanner;

public class Question10{
  public static void main ( String args[] ){
    Scanner scan = new Scanner(System.in);
    String nome,
           sobrenome;

    System.out.print("Digite o seu nome: ");
    nome = scan.nextLine();
    System.out.print("Digite o seu sobrenome: ");
    sobrenome = scan.nextLine();

    System.out.println(sobrenome + " " + nome);
  }
}
