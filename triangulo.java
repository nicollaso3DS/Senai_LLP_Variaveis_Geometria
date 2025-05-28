import java.util.Scanner;

public class triangulo {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite a base do triangulo:");
        int base = leia.nextInt();


        System.out.print("Digite a altura do triangulo:");
        int altura = leia.nextInt();
        

        int area = base*altura/2;

        System.out.print("A area do seu retangulo é:"+area);

    }
}