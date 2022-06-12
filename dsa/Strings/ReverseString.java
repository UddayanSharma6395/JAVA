import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //String input
        System.out.println("Enter the String");
        String str=sc.nextLine();
        String words[] = str.split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
             sb.append(words[i]).append(" ");
        }
         System.out.println(sb.toString().trim());
         sc.close();
    }
}
