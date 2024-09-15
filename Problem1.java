import java.util.Arrays;

public class Problem1 {
    public static void main(String[] args) {
        int[] nums = { -8 , -3 , 1 , 3 , 7};
        int[] sort = sorted(nums);
        Arrays.sort(sort);
        System.out.println(Arrays.toString(sort));


    }

    public static int[] sorted(int[] nums) {
        for(int i=0 ; i < nums.length ; i++) {
            nums[i] = nums[i] * nums[i];
        }
        return nums;
    }
}
