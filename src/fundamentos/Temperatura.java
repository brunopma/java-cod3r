package fundamentos;

public class Temperatura {
    public static void main(String[] args) {
        final double FATOR = 5.0/9;
        final int AJUSTE = 32;
        double fahrenheit = 0;

        double celsius = (fahrenheit - AJUSTE) * FATOR;
        System.out.println(celsius);
    }
}
