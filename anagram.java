import java.lang.String;
import java.util.Arrays;
public class Anagram {
    public static void main(String args[]){
        String str1="Care";
        String str2="Race";
        str1=str1.toLowerCase();
        str2=str2.toLowerCase();
        char[] fArray=str1.toCharArray();
        char[] sArray=str2.toCharArray();
        Arrays.sort(fArray);
        Arrays.sort(sArray);
        boolean result=Arrays.equals(fArray,sArray);
        if(result){
            System.out.println("It's Anagram");
        }else{
            System.out.println("It's not Anagram");
        }
    }
}
