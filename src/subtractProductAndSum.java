public class subtractProductAndSum {

    public static int subtractProductAndSum(int n) {

        int sum = 0;
        int mul = 1;
        int num = n;
        while(num  != 0){
            sum += num%10;
            mul *= num%10;
            num = num /10;
        }

        return mul - sum;
    }

    public static void main(String[] args) {
        System.out.println(subtractProductAndSum(234));
    }
}
