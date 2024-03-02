import java.util.Scanner;

public class Question16{
  public static void main ( String args[] ){
    Scanner scan = new Scanner(System.in);
    System.out.print("Digite o seu nome: ");
    String nome = scan.nextLine();
    scan.close();

    int size = nome.length();

    if (size <= 5){
      System.out.println("O seu nome é menor ou igual a 5 caracteres");
    }
    else{
      System.out.println("O seu nome tem mais que 5 caracteres");
    }
  }
}
