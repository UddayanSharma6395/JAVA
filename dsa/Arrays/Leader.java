import java.util.*;

public class Leader {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> result = new ArrayList<Integer>();

        System.out.println("Enter size of array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter "+n+" elements");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        result.add(arr[n-1]);
        int max=arr[n-1];
        for(int i=n-2;i>=0;i--)
        {
            if(arr[i]>=max)
            {
                max=arr[i];
                result.add(arr[i]);
            }
        }
        Collections.reverse(result);
        System.out.println(result);
        // for(int i=result.size()-1;i>=0;i--)
        // {
        //     System.out.println(result.get(i));
        // }
       sc.close();
    }
}
