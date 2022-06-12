import java.util.Scanner;
class ThirdLargest
{
    public static void main(String[] args) {
        int arr[]=new int[10];//10,20,30,40,50,60,70,80,90
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 10 elements in array");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        int max=-1,smax=-1,tmax=-1;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                tmax=smax;
                smax=max;
                max=arr[i];
            }
            else if(arr[i]>smax && arr[i]<max)
            {
                tmax=smax;
                smax=arr[i];
            }
            else if(arr[i]>tmax && arr[i]<smax && arr[i]<max)
            {
                tmax=arr[i];
            }
        }
        System.out.println(tmax+" is the third largest element in the given array ");
        sc.close();
        
    }
}