class Solution {
    public int strStr(String haystack, String needle) {
 
        int n = haystack.length();
        int sub = needle.length();
        int i = 0;
        while(i<=n-sub)
        {
            if(needle.equals(haystack.substring(i,i+sub)))
            {
                return i;
            }
            i = i+1;
        }
        return -1;
    }
}