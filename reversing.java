import java.util.Scanner;
public class Reversing {
    public static void main(String args[]){
        Scanner aki=new Scanner(System.in);
        System.out.println("Enter the String:");
        String a=aki.next();
        String b=" ";
        for(int i=a.length()-1;i>=0;i--){
            b=b+a.charAt(i);
        }
        System.out.println("Reversing:"+b);
    }

}
