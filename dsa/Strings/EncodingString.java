import java.util.Scanner;

public class EncodingString
{
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        
        //String input
        System.out.println("Enter the String");
        String str=sc.next();
        int c=0;
        char ch=str.charAt(0);
        String result=""+str.charAt(0);
        
        for(int i=1;i<str.length();i++)
        {// for loop begin
            if(str.charAt(i)!=ch)
            {
                result=result+(c+1)+str.charAt(i);
                ch=str.charAt(i);
                c=0;
            }
            else
            {
                c++;
            }
        }// for loop end
        System.out.println(result+(c+1));
    }
}