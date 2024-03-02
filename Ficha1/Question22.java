import java.util.Scanner;

public class Question22{
    
    public static void main (String args[]){
        Scanner scan = new Scanner(System.in);
        String number = scan.nextLine();
        scan.close();

        int sum = Integer.parseInt(number) + 10;
        number = Integer.toString(sum);

        System.out.printf("%s%n", number);
    }

}