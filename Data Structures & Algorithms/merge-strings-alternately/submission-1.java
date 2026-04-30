class Solution {
    public String mergeAlternately(String word1, String word2) {
        int p=0;
        int r=0;
        StringBuilder res=new StringBuilder();
        while(p<word1.length() || r<word2.length())
        {
            if(p<word1.length()){
            res.append(word1.charAt(p));
            p++;
            }
            if(r<word2.length()){
            res.append(word2.charAt(r));
            r++;
            }
        }
        return res.toString();
    }
}