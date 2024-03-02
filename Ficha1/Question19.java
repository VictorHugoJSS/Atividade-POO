import java.util.Scanner;

public class Question19{
    public static void main (String args[]){
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o nome da sua cidade: ");
        String cidade = scan.nextLine();
        scan.close();

        if (cidade.charAt(0) == 'S' || cidade.charAt(0) == 's'){
            System.out.println("A cidade digita começa com S");
        }
        else{
            System.out.println("A cidade digitada não começa com S");
        }
    }
}