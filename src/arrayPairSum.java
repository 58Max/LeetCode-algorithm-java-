import java.lang.reflect.Array;
import java.util.Arrays;

public class arrayPairSum {

    public static int arrayPairSum(int[] nums) {

        int sum = 0;
        Arrays.sort(nums);

        for(int i = 0;i < nums.length/2;i++){
            sum += Math.min(nums[2*i],nums[2*i+1]);
        }

        return sum;
    }

    public static void main(String[] args) {
        int[] arr = {1,4,3,2,3,4};

        System.out.println(arrayPairSum(arr));
    }
}
