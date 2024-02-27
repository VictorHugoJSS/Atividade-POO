// Q5: Square Number
// Leia um numero e calcule seu quadrado

import java.util.Scanner;

public class Question5{
  public static void main ( String args[] ){
    Scanner scanf = new Scanner(System.in);
    float number = scanf.nextFloat(),
          square;
    scanf.close();

    square = number * number;

    System.out.printf("O quadrado do numero dito é: %.2f%n", square);

    System.exit(0);
  }
}
