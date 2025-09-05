class Solution {
    public static boolean palin(String s,int i ,int j)
    {
        while(i<j)
        {
            if(s.charAt(i)!=s.charAt(j))
            {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public String longestPalindrome(String s) {
        int i = 0;
        
        int max=0;
        String ans ="";
        while(i<s.length())
        {
            int j = s.length()-1;
            while(i<=j)
            {
               if(palin(s, i, j) && max<j-i+1)
               {
                max = Math.max(max,j-i+1);
                ans = s.substring(i,j+1);
               }
               j--; 
            }
            
            i++;
            
        }
        return ans;
    }
}