class Solution {
    public String largestGoodInteger(String num) {
       int i=0;
       int j=2;
       String maxSubString = "";
       String currString ="";
       while(j<num.length())
       {
          
          if(num.charAt(i) == num.charAt(i+1) && num.charAt(i) == num.charAt(j))
          {
            currString = num.substring(i,j+1);
          }
          if(maxSubString.equals("") || maxSubString.charAt(0) < currString.charAt(0))
          {
            maxSubString = currString;
          }
          i++;
          j++;
       }
       if(maxSubString.equals(""))
       {
        return "";
       }
       return maxSubString;
    }
}