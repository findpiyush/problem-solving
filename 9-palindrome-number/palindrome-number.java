class Solution {
    public boolean isPalindrome(int x) {
        if(x<0)
        {
            return false;
        }
        int x1 = x;
        int rev = 0;
        while(x1>0)
        {
            rev = rev*10+x1%10;
            x1/=10;
        }
        if(rev==x){
            return true;
        }
        else{
            return false;
        }
    }
}