public class minDays {


    public static int minDays(int[] bloomDay, int m, int k) {

        if(m*k>bloomDay.length){
            return -1;
        }

        int max = 0;

        for(int i : bloomDay){
            max = Math.max(max,i);
        }

        int min = 0;

        while(min < max){

            int mid =(max + min)/2;

            int count = getCount(bloomDay,mid,k);

            if(count >= m){
                max = mid;
            }else
                min = mid + 1 ;
        }
        return min;
    }


    public static int getCount(int[] bloomDay, int day, int k){
        int count = 0 ;
        int re = 0;
        for(int i = 0;i < bloomDay.length;i++){
            if(bloomDay[i] <= day){
                count++;
            }else
                count=0;
            if(count == k){
                re++;
                count = 0;
            }
        }
        return re;
    }


    public static void main(String[] args) {
        int[] arr = {1,10,2,10,3};
        System.out.println(minDays(arr, 3, 1));
    }

}
