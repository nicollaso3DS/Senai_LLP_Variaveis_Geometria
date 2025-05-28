
import java.util.Scanner;

public class retangulo {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite a base do retangulo:");
        float base = leia.nextInt();


        System.out.print("Digite a altura do retangulo:");
        float altura = leia.nextInt();
        

        float area = base*altura;

        System.out.print("A area do seu retangulo é:"+area);

    }
}