import java.util.Scanner;
import java.lang.String;
public class Array{
    public static void main(String args[]) {
        Scanner aki=new Scanner(System.in);
        System.out.println("Enter the String:");
        String s=aki.next();
        int count=0;
        char b='a';
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==b)
            {
                count++;
            }
        }
        System.out.println("The Count Of the letter is:"+count);
}
}
