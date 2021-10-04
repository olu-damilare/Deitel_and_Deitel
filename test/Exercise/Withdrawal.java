package Exercise;

import java.util.Arrays;

public class Withdrawal {

    public static int[] withdraw(int amount) {
        int[] billCounts = new int[3];
        while (amount > 0) {
            if (amount >= 100 && !(amount % 20 != 0 && (amount - 50) % 20 == 0)) {
                amount = (amount - 100);
                billCounts[0]++;
            } else if (amount >= 50 && amount % 20 != 0) {
                amount = (amount - 50);
                billCounts[1]++;
            } else if (amount >= 20) {
                amount = (amount - 20) ;
                billCounts[2]++;
            }
        }
        return billCounts;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(Withdrawal.withdraw(260)));
    }

}
