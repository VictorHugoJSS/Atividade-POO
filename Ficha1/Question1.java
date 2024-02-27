// Q1 : Mensagem de boas vindas
// Fazer um programa que leia um nome
// e faça uma mensagem de boas vindas

import java.util.Scanner;

public class Question1{
    public static void main (String args[]){
        Scanner scanf = new Scanner(System.in);
        String nome = scanf.nextLine();
        scanf.close();

        System.out.println("Seja bem vindo, " + nome);

        System.exit(0);
    }
}