// Q4: soma de inteiros
// Fazer um programa que leia dois números e mostre a soma

import java.util.Scanner;

public class Question4{
    public static void main ( String args[] ){
        Scanner scanf = new Scanner(System.in);
        int sum;

        System.out.print("Digite o primeiro numero: ");
        int firstNumber = scanf.nextInt();
        System.out.print("Digite o segundo numero: ");
        int secondNumber = scanf.nextInt();
        scanf.close();

        sum = firstNumber + secondNumber;

        System.out.println("A soma dos valores " + firstNumber + " e " + secondNumber + " = " + sum);

        System.exit(0);
    }
}