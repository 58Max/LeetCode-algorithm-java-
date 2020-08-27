import java.util.Arrays;

public class diStringMatch {
    public static int[] diStringMatch(String S) {

        int length = S.length()+1;

        //用来记录递增，递减的第几个
        int incrindex = 1;

        int decrindex = 0;

        int[] arr = new int[length];
        int i = 0;
        while(i<length-1){
            if(S.charAt(i) == 'D'){
                arr[i] = length - incrindex;
                incrindex++;
                i++;
            }else if (S.charAt(i) == 'I'){
                arr[i] = decrindex;
                decrindex++;
                i++;
            }
        }
        arr[i] = decrindex;

        return arr;
    }

    public static void main(String[] args) {
       Arrays.stream(diStringMatch("IDID")).forEach(i -> System.out.print(i));
    }

}
