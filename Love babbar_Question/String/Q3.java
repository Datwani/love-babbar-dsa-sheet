import java.util.Arrays;

public class Q3 {


    public static void main(String[] args) {
        String s="Geeksofgeeks";
        char[] ch=new char[s.length()];

        for (int i=0;i<s.length();i++)
        {
            ch[i]=s.charAt(i);
        }
        for (int i=0;i<s.length()-1;i++)
        {
            if (ch[i]>ch[i+1])
            {
                char temp=ch[i];
                ch[i]=ch[i+1];
                ch[i+1]=temp;
            }
            System.out.println(ch[i]);

        }

    }
}
