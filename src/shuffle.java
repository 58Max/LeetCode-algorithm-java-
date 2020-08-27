import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class shuffle {
    public static int[] shuffle(int[] nums, int n) {

        int[] array = new int[nums.length];
        int j = 0;
        for(int i =0;i < n ;i++){
            array[j++] = nums[i];
            array[j++] = nums[n+i];
        }

        return  array;
    }

    public static void main(String[] args) {
        int[] nums = {2,5,1,3,4,7};
        Arrays.stream(shuffle(nums, 3)).forEach(System.out::println);
    }
}
