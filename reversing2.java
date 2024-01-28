import java.util.Scanner;
import java.lang.String;
public class Reversing{
    public static void main(String args[]){
        Scanner aki=new Scanner(System.in);
        System.out.println("Enter the String:");
        String a=aki.next();
        StringBuilder c=new StringBuilder();
        for(int i=a.length()-1;i>=0;i--){
           c.append(a.charAt(i));
        }
        System.out.println("Reversing:"+c);

    }
}
