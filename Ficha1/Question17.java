import java.util.Scanner;

public class Question17{
  public static void main ( String args[] ){
    Scanner scan = new Scanner(System.in);
    System.out.print("Digite seu estado civil: ");
    String estado = scan.nextLine();
    scan.close();

    switch(estado){
      case "casado":
      case "casada":
        System.out.println("Você é casado(a)");
        break;
      case "solteiro":
      case "solteira":
        System.out.println("Você é solteiro(a)");
        break;
      case "separado":
      case "separada":
        System.out.println("Você é separado(a)");
        break;
      case "divorciado":
      case "divorciada":
        System.out.println("Você é divorciado(a)");
        break;
      case "viúvo":
      case "viúva":
        System.out.println("Você é viúvo(a)");
        break;
    }
  }
}
