public class MaxProduct {

    public static int maxProduct(int[] nums){

        if(nums.length <= 1){
            return nums[0];
        }


        int maxres = nums[0];
        int minres = nums[0];
        int max58 = maxres;
        for(int i = 1; i <nums.length;i++ ){


            maxres = max(maxres*nums[i],max(minres*nums[i],nums[i]));
            minres = min(maxres*nums[i],min(minres*nums[i],nums[i]));


            max58 = max(max58,maxres);

        }

        // return maxres;

        return max58;

    }

    public static int max(int a, int b){
        return a > b? a : b;
    }

    public static int min(int a, int b){
        return a < b? a : b;
    }

}
