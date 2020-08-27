public class reverseLeftWords {
    /**
     * 简单的substring()剪切运算
     * @param s
     * @param n
     * @return
     */
//    public static String reverseLeftWords(String s, int n) {
//
//        return s.substring(n,s.length())+s.substring(0,n);
//    }

    /**
     * 求余运算 i % n+s.length()
     * 先获取右边的字符再获取左边的字符
     * @param
     */

    public static String reverseLeftWords(String str,int n){
        String res = "";

        for(int i = n;i < n+str.length();i++){
            res += str.charAt(i%str.length());
        }

        return res;

    }

    public static void main(String[] args) {
        System.out.println(reverseLeftWords("abcdefg", 2));
    }
}
