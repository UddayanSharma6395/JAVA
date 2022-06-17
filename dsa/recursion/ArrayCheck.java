
/* Given an Array and we need to find the element of the array are sorted or not?  */

public class ArrayCheck {
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50};
        System.out.println(isSorted(arr,arr.length)? "Array is sorted" :"Array is not sorted");
        
    }
    static boolean isSorted(int []arr,int l)
    {
        if(l<=1)
          return true;
        else
        {
            if(arr[arr.length-l]<=arr[arr.length-l+1])
            {
                return isSorted(arr,l-1);
            }
            else
            return false;
        }
    }
}
