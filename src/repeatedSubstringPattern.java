public class repeatedSubstringPattern {

    public static boolean repeatedSubstringPattern(String str){

        return (str+str).substring(1,2*str.length()-1).contains(str);
    }

    public static void main(String[] args) {
        System.out.println(repeatedSubstringPattern("abcabc"));
    }

}
