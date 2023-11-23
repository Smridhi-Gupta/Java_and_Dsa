package arrays.practice;
public class price {
    public static void main(String[] args) {
        int[] price = {7,1,5,3,6,4};

        System.out.println(Profit(price,0,0));
    }

    public static int Profit(int[] price, int sell, int buy) {
        int profit = 0;
        for (int i = 0; i < price.length ; i++) {
            profit = price[buy] - price[sell];
            if (profit <= 0) {
                return 0;
            }
        }
        return profit;

    }
}
