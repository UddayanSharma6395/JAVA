import java.util.ArrayList;
import java.util.List;

public class Sub {
    public static void main(String[] args) {
         List<Integer> subtractArray(int nums1[], int nums2[])
    {
        //subtract nums2 from nums1
        List<Integer> c=new ArrayList<>();
        int a=nums1.length-1;
        int b=nums2.length-1;
        while(a>-1 && b>-1)
        {
            if(nums1[a]>=nums2[b])
            {
                c.add(nums1[a]-nums2[b]);
            }
            else
            {
                if(a==0)
                {
                    throw new ArithmeticException("num 1 < num 2");
                }
 
                nums1[a-1]--;
                c.add(nums2[b]-nums1[a]);
            }
            a--;
            b--;
        }
 
        while(a>-1)
        {
            c.add(nums1[a--]);
        }
 
        if(b>-1)
        {
            throw new ArithmeticException("num 1 < num 2");
        }
        Collections.reverse(c);
        return c;
    }

    }
}
