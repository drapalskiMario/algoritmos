package src.fatorial;

public class FatorialTopDown {
    static long[] memo;

    public static long calcularFatorialTopDown(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }

        if (memo[n] != 0) {
            return memo[n];
        }

        memo[n] = n * calcularFatorialTopDown(n - 1);
        return memo[n];
    }


    public static void main(String[] args) {
        int numero = 7;
        memo = new long[numero + 1];
        long resultado = calcularFatorialTopDown(numero);
        System.out.println("Fatorial de " + numero + " = " + resultado);
    }
}
