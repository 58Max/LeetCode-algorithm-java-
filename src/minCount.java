public class minCount {
    public static int minCount(int[] coins) {

        int count = 0;

        for(int coin : coins){
            count +=(coin+1)/2;
        }
        return count;
    }


    public static void main(String[] args) {
        int[] coins ={4,2,1};

        System.out.println(minCount(coins));
    }

}
