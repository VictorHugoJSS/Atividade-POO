// Q8: Number Sequence
// Leia uam sequencia de numeros e exiba quantos numeros foram digitado

import java.util.Scanner;

public class Question8{
  public static void main ( String args[] ){
    int number,
    quant = 0;
    
    Scanner scan = new Scanner(System.in);
    
    while (scan.hasNext()){
      number = scan.nextInt();
      quant++;
    }
    scan.close();

    System.out.printf("A quantidade de numeros digitados foram: %d%n", quant);
    System.exit(0);
  }
}
