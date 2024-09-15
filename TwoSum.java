import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] num = {2 , 9 , 7 , 11};
        int size = num.length;
        System.out.println(size);
        int target = 9;
        int[] ans = twoSum(num , target);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] twoSum(int[] nums , int target) {
        HashMap<Integer , Integer> map = new HashMap();
        for(int i = 0;i<nums.length ; i++) {
            int complement = target - nums[i];
            if(map.containsKey(complement)) {
                return new int[] {map.get(complement) , i};
            }
            map.put(nums[i] , i);
        }
        return null;
    }
}
