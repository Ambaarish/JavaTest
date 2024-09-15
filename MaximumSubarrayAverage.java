public class MaximumSubarrayAverage {
    public static void main(String[] args) {
        int[] nums = {1, 12, -5, -6, 50, 3};
        System.out.println(AverageSubarray(nums, 4));
    }

    public static double AverageSubarray(int[] nums, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum = sum + nums[i];
        }

        int maxSum = sum;

        int startIndex = 0;
        int lastIndex = k;

        while (lastIndex < nums.length) {
            sum = sum - nums[startIndex];
            startIndex++;

            sum = sum + nums[lastIndex];
            lastIndex++;

            maxSum = Math.max(maxSum, sum);
        }

        return(double)maxSum /k;
}
}
