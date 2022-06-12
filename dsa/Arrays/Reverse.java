import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        int arr[]=new int[10];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 10 elements in array");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        int n=arr.length-1;
        for(int i=0;i<n/2;i++)
        {
            int temp=arr[n-i];
            arr[n-i]=arr[i];
            arr[i]=temp;

        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }

}
