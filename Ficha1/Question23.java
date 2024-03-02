import java.util.Scanner;

public class Question23{
    public static void main (String args[]){
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um data no formato dd/mm/aaaa:");
        String date = scan.nextLine();
        scan.close();
        
        int day = Integer.parseInt(date.substring(0, 2));
        int month = Integer.parseInt(date.substring(3, 5));
        int year = Integer.parseInt(date.substring(6, 10));
        System.err.printf("Dia: %d%nMes: %d%nYear: %d%n", day, month, year);
    }
}