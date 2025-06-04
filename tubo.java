public class tubo {
    public class Tubo {
    public static double calcularArea(double raio, double altura) {
        double areaLateral = 2 * Math.PI * raio * altura;
        double areaBases = 2 * Math.PI * raio * raio;
        return areaLateral + areaBases;
    }

    public static void main(String[] args) {
        double area = calcularArea(3, 8);
        System.out.println("Área do Tubo: " + area);
    }
}

}
