class Solution {
    public String mergeAlternately(String word1, String word2) {
        int p=0;
        int r=0;
        StringBuilder res=new StringBuilder();
        while(p<word1.length() && r<word2.length())
        {
            res.append(word1.charAt(p));
            res.append(word2.charAt(r));
            p++;
            r++;
        }
        if(word1.length()>word2.length())
        {
            res.append(word1.substring(p));
        }
        else
        {
            res.append(word2.substring(r));
        }
        return res.toString();
    }
}