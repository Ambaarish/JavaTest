public class BuyAndSellStock2 {
    public static void main(String[] args) {
        int[] nums = {7,1,3,5,6,4};
        System.out.println(profit(nums));
    }
    public static int profit(int[] nums) {
        int minPrice = Integer.MAX_VALUE;
        int profit = 0;

        for(int i=0; i< nums.length ; i++) {
            if(nums[i] < minPrice) {
                minPrice = nums[i];
            }
            else {
                profit = profit + nums[i] - minPrice;
                minPrice = nums[i];
            }
        }
        return profit;
    }
}
