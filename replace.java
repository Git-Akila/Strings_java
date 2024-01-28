import java.util.Scanner;
public class Replace {
    public static void main(String args[]){
        Scanner aki=new Scanner(System.in);
        System.out.println("The String:");
        String a=aki.nextLine();
        char b='-';
        a=a.replace(' ',b);
        System.out.print("After Replacing:"+a);


    }

}
