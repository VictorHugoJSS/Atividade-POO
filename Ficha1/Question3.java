// Q3: Int to Float
// Fazer um programa que receba numero int e tranforme para float

import java.util.Scanner;

public class Question3{
  public static void main ( String args[] ){
    Scanner scanf = new Scanner(System.in);

    System.out.print("Digite um numero inteiro: ");
    int numberInt = scanf.nextInt();
    scanf.close();

    float numberFloat = (float) numberInt;

    System.out.printf("O inteiro que você digitou na forma de float é: %f%n", numberFloat);
    
    System.exit(0);
  }
}
