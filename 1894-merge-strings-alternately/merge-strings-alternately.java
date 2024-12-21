class Solution {
    public String mergeAlternately(String word1, String word2) {
        
        String merge_word = "";
        int i=0;

        while(i<word1.length() || i<word2.length())
        {
            if(i <word1.length())
                merge_word += word1.charAt(i);
            if(i <word2.length())
                merge_word += word2.charAt(i);
                
            i++;
        }

        return merge_word;
    }
}