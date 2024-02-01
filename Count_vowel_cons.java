import java.util.Scanner;
public class Count_vowel {
    public static void main(String args[]) {
        Scanner aki=new Scanner(System.in);
        System.out.println("Enter the String:");
        String a=aki.nextLine();
        int vowel=0,cons=0;
        a=a.toLowerCase();
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)=='a'|| a.charAt(i)=='e'||a.charAt(i)=='i'||a.charAt(i)=='o'||a.charAt(i)=='u'){
                vowel++;
            }else{
                cons++;
            }
        }
        System.out.println("The Total Count of Vowel is:"+vowel);
        System.out.println("The Total Count of Consonant is:"+cons);

    }
}
