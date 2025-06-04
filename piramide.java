import java.util.Scanner;
public class piramide {
    public class Piramide {
    public static double calcularArea(double ladoBase, double alturaFaceLateral) {
        double areaBase = ladoBase * ladoBase;
        double areaLateral = 2 * ladoBase * alturaFaceLateral;
        return areaBase + areaLateral;
    }

    public static void main(String[] args) {
        double area = calcularArea(4, 6);
        System.out.println("Área da Pirâmide: " + area);
    }
}

}
