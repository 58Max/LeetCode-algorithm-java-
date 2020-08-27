import java.util.Stack;

public class MoveChar {

    public static String  removeKdigits(String num, int k) {

        if(num.length() == k){
            return "0";
        }

        Stack stack = new Stack();


        stack.push(num.charAt(0));
        for(int i =1;i<num.length();i++){

            int num1 = Integer.parseInt(String.valueOf(num.charAt(i)));
            int num2 =  Integer.parseInt(String.valueOf(stack.peek()));
            if(num1 < num2 && k != 0){
                stack.pop();
                stack.push(num.charAt(i));
                k--;
            }else{
                stack.push(num.charAt(i));
            }

        }
        while(k!=0){
            int num3 =  Integer.parseInt(String.valueOf(stack.pop()));
            if(Integer.parseInt(String.valueOf(stack.peek())) > num3){
                stack.pop();
                stack.push(num3);
            }
            k--;
        }

        StringBuffer str = new StringBuffer();


        while(!stack.empty()){
            str.append(stack.pop());
        }

        if(str.reverse().charAt(0) == '0' && str.length()!=1){
            str.deleteCharAt(0);
        }

        return str.toString();

    }

    public static void main(String[] args) {

        System.out.println(removeKdigits("112", 1));

//        StringBuffer stringBuffer = new StringBuffer();
//        stringBuffer.append("111111111");
//        stringBuffer.trimToSize();
//        System.out.println(stringBuffer);

    }

}
