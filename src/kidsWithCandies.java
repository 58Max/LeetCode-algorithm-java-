import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class kidsWithCandies {
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Integer> list = new ArrayList<>();

        for(int candie : candies){
            list.add(candie);
        }

        int max = Collections.max(list);

       List<Boolean> flag = new ArrayList<>();

        for(int i = 0; i<candies.length;i++){
            if(max <= (candies[i] + extraCandies)){
                flag.add(true);
            }else
                flag.add(false);
        }

        return flag;
    }


    public static void main(String[] args) {
        int[] candies = {4,2,1,1,2};
        int extraCandies = 1;

        kidsWithCandies(candies,extraCandies).forEach(System.out ::print);
    }
}
