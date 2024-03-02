import java.util.*;

public class Question24{
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite um nome da cidade no Estado de Pernambuco: ");
        String cidade = sc.nextLine();
        sc.close();

        System.out.println("Você mora em "+cidade+", "+"Pernambuco");
    }
}