public class counting {
    public static void main(String args[])
    {
        Scanner aki=new Scanner(System.in);
        System.out.println("Enter the String:");
        String a=aki.nextLine();
        int i,alph,digit,spl,un;
        alph=digit=spl=un=0;
        for(i=0;i<a.length();i++){
            if(a.charAt(i)>='a' && a.charAt(i)<='z'||a.charAt(i)>='A'||a.charAt(i)>='Z')
            {
                alph++;
            }else if(a.charAt(i)>='0' && a.charAt(i)<='9')
            {
                digit++;
            }else if(a.charAt(i)>=32&& a.charAt(i)<=127)
            {
                spl++;
            }else {
                un++;}}
        System.out.println("The Alphabets:"+alph);
        System.out.println("The Digits are:"+digit);
        System.out.println("The Special character:"+spl);
        System.out.println("Unwanted:"+un);

    }
}
