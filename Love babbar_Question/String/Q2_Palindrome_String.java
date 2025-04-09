public class Q2_Palindrome_String {
    public static void main(String[] args) {
        String s="madam";
        char[]ch = new char[s.length()];
        int count=0;
        for (int i=0;i<s.length();i++)
        {
            ch[i]=s.charAt(i);
        }
        int i=0;
        int j=s.length()-1;
       while (i<=j)
       {
           if (ch[i]!=ch[j])
           {
               count++;
               break;
           }
           i++;
           j--;
       }
       if (count==0)
       {
           System.out.println("Palindrome String");
       }else {
           System.out.println("Not Palindrome String");
       }
        System.out.println();
    }
}
