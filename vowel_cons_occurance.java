import java.util.Scanner;
public class Replace{
    public static void main(String args[]){
        Scanner aki=new Scanner(System.in);
        System.out.println("Enter the String:");
        String a=aki.nextLine();
        a=a.toLowerCase();
        int vowel=0,cons=0;
        for(int i=0;i<a.length();i++){
        if(a.charAt(i)=='a' || a.charAt(i)=='e'||a.charAt(i)=='i'||a.charAt(i)=='o'||a.charAt(i)=='u'){
            vowel++;

        }else if(a.charAt(i)>='a'&&a.charAt(i)<='z'){
            cons++;
        }else{
            System.out.println("It's not a Vowel and Constant");
        }
    }
        System.out.println("Vowels occurance:"+vowel);
        System.out.println("Constant occurance::"+cons);
}}
