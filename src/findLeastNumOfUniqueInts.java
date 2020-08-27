import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class findLeastNumOfUniqueInts {

    public static int findLeastNumOfUniqueInts(int[] arr, int k){
        Map<Integer,Integer> map = new HashMap<>();
        for(int i =0;i < arr.length; i++){
            if(map.containsKey(arr[i])){
                map.replace(arr[i],map.get(arr[i])+1);
            }else
                map.put(arr[i],1);
        }

        System.out.println(map.toString());

        int[] num = new int[map.size()];

        int a = 0;
        for(int key : map.keySet()){

            num[a++] = map.get(key);
        }

        Arrays.sort(num);

        int i;
        for(i = 0;i<num.length;i++){
            if(k-num[i]>=0){
                k -= num[i];
            }else
                break;
        }

        return num.length-i;
    }

    public static void main(String[] args) {
        int[] arr = {5,4,4};
        System.out.println(findLeastNumOfUniqueInts(arr, 1));
    }

}
