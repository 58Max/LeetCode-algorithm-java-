import java.util.HashMap;
import java.util.Map;

public class TwoSum {


    public int[] twoSum(int[] nums,int target){

        Map<Integer,Integer> map = new HashMap();
        for(int i = 0;i < nums.length; i++){

            int commpent = target - nums[i];
            if(map.containsKey(commpent) ){
                return new int[]{i,map.get(commpent)};
            }

            map.put(nums[i],i);
        }
        return null;

    }

}
