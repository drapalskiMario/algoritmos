package src.fatorial;

public class FatorialBottomUp {

    public static long calcularFatorialBottomUp(int n) {
        long[] fatorial = new long[n + 1];
        fatorial[0] = 1;

        for (int i = 1; i <= n; i++) {
            fatorial[i] = i * fatorial[i - 1];
        }

        return fatorial[n];
    }

    public static void main(String[] args) {
        int numero = 7;
        long resultado = calcularFatorialBottomUp(numero);
        System.out.println("Fatorial de " + numero + " = " + resultado);
    }
}
