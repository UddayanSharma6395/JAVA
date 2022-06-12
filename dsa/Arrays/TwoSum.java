import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        int arr[]=new int[10];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 10 elements in array");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the target value");
        int t=sc.nextInt();
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if((arr[i]+arr[j])==t)
                {
                    System.out.println(i+" , "+j);
                    break;
                }
            }
        }
        sc.close();
    }
}
