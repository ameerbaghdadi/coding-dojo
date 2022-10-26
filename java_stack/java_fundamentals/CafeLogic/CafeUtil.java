import java.util.ArrayList;
public class CafeUtil {
    public int getStreakGoal() {
        int sum = 0;
        for (int i = 0; i <= 10 ; i++) {
            sum += i;
        }
        return sum;
    }

    double getOrderTotal(double[] prices) {
        int sum = 0;
        for (int i =0; i < prices.length; i++) {
            sum += prices[i];
        }
        return sum;
    }

    void displayMenu(ArrayList<String> menu) {
        for (int i = 0; i < menu.size() ; i++) {
            System.out.println(i + " " + menu.get(i));
        }
    }

    // addCustomer(ArrayList<String>) {

    // }
}