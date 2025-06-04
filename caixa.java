public class caixa {
    public class Caixa {
    public static double calcularArea(double largura, double altura, double profundidade) {
        return 2 * (largura * altura + largura * profundidade + altura * profundidade);
    }

    public static void main(String[] args) {
        double area = calcularArea(5, 10, 3);
        System.out.println("Área da Caixa: " + area);
    }
}

}
