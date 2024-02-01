import java.util.Scanner;
public class Change_case{

    public static void main(String args[]){
        Scanner aki=new Scanner(System.in);
        System.out.println("Enter the String:");
        String a=aki.nextLine();
        StringBuilder b=new StringBuilder(a);
        for(int i=0;i<b.length();i++){
            if(Character.isLowerCase(b.charAt(i))){
                b.setCharAt(i,Character.toUpperCase(b.charAt(i)));
            }
            else if(Character.isUpperCase(b.charAt(i))){
                b.setCharAt(i,Character.toLowerCase(b.charAt(i)));
            }
        }
        System.out.println("The String is:"+b);
    }
}
