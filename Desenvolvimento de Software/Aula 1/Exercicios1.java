
import java.util.Scanner;

class Exercicios1 {
    public static void main(String[ ] args) {
    Scanner leitor = new Scanner(System.in);
    
    System.out.println("Altura");
    double a = leitor.nextDouble();

    System.out.println("Largura");
    double l = leitor.nextDouble();
    
    double resultado = (a*l);
    System.out.println(resultado);

    }
}