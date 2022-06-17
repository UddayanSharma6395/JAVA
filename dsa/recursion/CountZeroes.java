
/*
WAP Count Number of Zero Digit in a given number e.g 1209803 Result 2
Reverse a String e.g tim output : mit
Print Fibonacii Series . e.g N = 10 
 Given an Array and we need to find the element of the array are sorted or not? */

public class CountZeroes {
    public static void main(String[] args) {
        int n=1902305;
        System.out.println("the number of zeroe's are : "+countZeros(n));
    }
    static int countZeros(int n)
    {
        if(n<=0)
        {
            return 0;
        }
        else
        {
            if(n%10==0)
            return 1+countZeros(n/10);
            else
            return countZeros(n/10);
        }
    }
}
