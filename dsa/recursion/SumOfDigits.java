
/*
WAP to do Sum of Digit. e.g num = 123 result = 6
*/
public class SumOfDigits
{
    public static void main(String[] args) {
        SumOfDigits sum=new SumOfDigits();
        int n=330310;
        System.out.println(sum.sumofdig(n));
    }
    public int sumofdig(int n)
    {
        if(n<=0)
        return 0;
        else
        {
            return(n%10 + sumofdig(n/10));
        }
    }
}
