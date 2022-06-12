class Solution {
    
    public boolean isAnagram(String s, String str) {
        int k=0;
        char [] s1=s.toCharArray();
        char [] s2=str.toCharArray();
        if(s.length()!=str.length())
        return false;
        Arrays.sort(s1);
        Arrays.sort(s2);
        for(int i=0;i<s1.length;i++)
        {
           if(s1[i]!=s2[i])
           {
               k++;
               return false;
           }                    
           
        }
           if(k==0)
            return true;  
       return false;
    }
}