class Solution {
    public String mergeAlternately(String word1, String word2) {
        
        int len = Math.max(word1.length(),word2.length());
        String merge_word = "";
        int k = 0, l=0;
        
        for(int i=0; i<len; i++)
        {
            if(k <word1.length())
                merge_word += word1.charAt(k++);
            if(l <word2.length())
                merge_word += word2.charAt(l++);
        }

        return merge_word;
    }
}