import java.util.*;
public class ZigZag {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of an array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        int i,t;
        System.out.println("Enter the elements");
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(i=0; i<arr.length-1; i++)
        {
            if(i%2==0)
            {
                if(arr[i]>arr[i+1])
                {
                    t=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=t;
                }
            }
            else
            {
                if(arr[i]<arr[i+1])
                { 
                    t=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=t;
                }
            }

        }
        for(i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }


    }

