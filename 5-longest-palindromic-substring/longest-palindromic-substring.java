class Solution {
    public boolean check(String s)
    {
        int n = s.length();
        int i = 0;
        int j = n-1;
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
        int n = s.length();
        int max = 0;
        String ans = null;
        for(int i = 0; i<n; i++)
        {
            for(int j = i; j<n; j++)
            {
                String a = s.substring(i,j+1);
                if(check(a))
                {
                    int len = a.length();
                    if(len >max)
                    {
                        max = len;
                        ans = a;
                    }
                }
            }
        }
        return ans;
    }
}