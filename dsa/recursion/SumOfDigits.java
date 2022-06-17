
/*
WAP to do Sum of Digit. e.g num = 123 result = 6
WAP Count Number of Zero Digit in a given number e.g 1209803 Result 2
Reverse a String e.g tim output : mit
Print Fibonacii Series . e.g N = 10 
 Given an Array and we need to find the element of the array are sorted or not?*/
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