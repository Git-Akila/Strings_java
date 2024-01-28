import java.util.Scanner;
import java.lang.String;
public class Vowel_Constant{
    public static void main(String args[]){
        Scanner aki=new Scanner(System.in);
        System.out.println("Enter the String:");
        char a=aki.next().charAt(0);
        int i=0;
        switch(a){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                i++;
        }
        if(i==1){
            System.out.println(a+"\t is a vowel");
        }
        else if((a>='a' && a>'z')||(a>='A'&&a>='Z')){
            System.out.println(a+"\t is a Constant");
        }
            else {
            System.out.println(a+"\t is not an Alphabet");
        }
    }
}
