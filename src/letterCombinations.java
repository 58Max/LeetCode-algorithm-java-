import java.util.ArrayList;
import java.util.List;

public class letterCombinations {

    private static String numMap[] = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    private static List<String> res;
    public static List<String> letterCombinations(String digits) {

        res = new ArrayList<>();

        if(0 == digits.length())
            return res;
        getIter(digits,"",0);

        return res;

    }

    public static void getIter(String digits,String letter,int index){

        if(index == digits.length()){
            res.add(letter);
            return;
        }

        int pos = digits.charAt(index) - '0';
        String str = numMap[pos];

        for(int i =0; i < str.length();i++){
            getIter(digits,letter + str.charAt(i),index+1);
        }

    }

    public static void main(String[] args) {
        letterCombinations("234").forEach(System.out :: println);
    }
}
