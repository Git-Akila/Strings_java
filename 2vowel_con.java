import java.util.Scanner;
public class Vowel_Constant{
    public static void main(String args[]){
        Scanner aki=new Scanner(System.in);
        System.out.println("Enter the Letter:");
        char a=aki.next().charAt(0);
        char b=Character.toLowerCase(a);
        if(b=='a'|| 'e' == b || b=='i'|| b=='o'||b=='u'){
            System.out.println(" Character is a vowel");

        }else {
            System.out.println("It's not a vowel");
        }
    }
}
