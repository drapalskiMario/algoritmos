package src.backtracking_guloso;

import java.util.ArrayList;
import java.util.List;

//Você tem que dar o troco de uma quantia em dinheiro usando o menor número possível de moedas.
//Exemplos:
//Entrada: Quantia 18, Moedas disponíveis 5, 2 e 1
//Saída: 5 (três moedas de cinco, uma de 2 e uma de 1)

public class CoinChange {
    public static List<Integer> giveChange(int amount, int[] coins) {
        var change = new ArrayList<Integer>();
        var i = 0;

        while (amount > 0 && i < coins.length) {
            if (coins[i] <= amount) {
                int numCoins = amount / coins[i];
                amount -= numCoins * coins[i];
                for (int j = 0; j < numCoins; j++) {
                    change.add(coins[i]);
                }
            }
            i++;
        }

        return change;
    }

    public static void main(String[] args) {
        int amount = 18;
        int[] availableCoins = {5, 2, 1};
        List<Integer> change = giveChange(amount, availableCoins);
        System.out.println(change);
    }
}
