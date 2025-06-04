public class bola {
    public class Bola {
    public static double calcularArea(double raio) {
        return 4 * Math.PI * raio * raio;
    }

    public static void main(String[] args) {
        double area = calcularArea(6);
        System.out.println("Área da Bola: " + area);
    }
}

}
