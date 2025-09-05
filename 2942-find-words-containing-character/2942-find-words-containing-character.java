class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
       List<Integer> list = new ArrayList<>();
       String ch = ""+x;
       for(int i=0; i<words.length ; i++)
       {
        String s = words[i];
        if(s.contains(ch))
        {
            list.add(i);
        }
       }
       return list; 
    }
}