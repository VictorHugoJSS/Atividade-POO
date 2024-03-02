import java.util.Scanner;

public class Question15{
  public static void main ( String args[] ){
    Scanner scan = new Scanner(System.in);
    System.out.print("Digite seu peso e sua altura:");
    double peso = scan.nextDouble();
    double altura = scan.nextDouble();
    double imc;
    scan.close();

    imc = peso / (altura * altura);

    System.out.printf("Seu indice de massa corporal é: %.2f%n", imc);
  }
}
