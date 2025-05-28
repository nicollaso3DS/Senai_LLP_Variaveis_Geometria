import java.util.Scanner;

public class circulo {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite a base do retangulo:");
        int raio= leia.nextInt();


        final double PI= 3.14;
    

        double area = PI*(raio*raio);
    

        System.out.println("A area do seu seu circulo é: "+area);

    }
}