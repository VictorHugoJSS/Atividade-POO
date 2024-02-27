// Q6: idade
// Recebe o ano de nascimento e dizer a idade

import java.util.Scanner;

public class Question6{
  public static void main ( String args[] ){
    Scanner scanf = new Scanner(System.in);

    System.out.print("Digite o seu ano de nascimento: ");
    
    int anoNasc = scanf.nextInt(),
        anoAtual = 2024,
        idade;
    scanf.close();
    
    idade = anoAtual - anoNasc;
    
    System.out.printf("Baseado no ano que você digitou a sua idade é: %d%n", idade);
    System.exit(0);    
  }
}
