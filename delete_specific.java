import java.util.Scanner;
public class Array {
    public static void main(String args[]) {
        Scanner aki = new Scanner(System.in);

        System.out.println("Enter the String:");
        String a=aki.next();
        StringBuilder ab=new StringBuilder(a);
        System.out.println("Enter the Deleted index:");
        int b=aki.nextInt();
        System.out.println("After Deleting the STRING:"+ab.deleteCharAt(b));


    }
}
