class Solution {
    public int maximum69Number (int num) {
        int max = num;
        String s = Integer.toString(num);
        for(int i=0 ; i<s.length(); i++)
        {
            String ans = s.substring(0,i) +"9" + s.substring(i+1);
            if(max< Integer.parseInt(ans))
            {
                max = Integer.parseInt(ans);
            }
            ans = s;
        }
        return max;
    }
}