public class xorOperation {

    public static int xorOperation(int n,int start){

        int res = 0;

        for(int i=0;i< n;i++){
            res ^=(start+2*i);
        }
        return res;

    }

    public static void main(String[] args) {
        System.out.println(xorOperation(4, 3));
    }

}
