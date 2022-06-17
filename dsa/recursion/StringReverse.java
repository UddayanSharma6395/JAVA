
/*
Reverse a String e.g tim output : mit
 */
public class StringReverse {
    public static void main(String[] args) {
        String str="Uddayan";
        int l=str.length()-1;
        System.out.println(reverseStr(str,l));
    }
    static String reverseStr(String str ,int l)
    {
        if(l<0)
        return "";
        else
        {
            return (str.charAt(l)+reverseStr(str,l-1));
        }
    }
}
