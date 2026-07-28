class Solution {
    public int mySqrt(int x) {
        long sum = 0;
        if(x==0 || x ==1) return x;
        for(long i = 0; i<=x; i++)
        {
            sum = i*i;
            if(sum>x)
            {
                return (int)i-1;
            }
        }
        return -1;
    }
}