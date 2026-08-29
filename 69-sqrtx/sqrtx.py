class Solution:
    def mySqrt(self, x: int) -> int:
        if(x==0 or x==1): return x;
        for i in range(0,x+1):
            square = i*i;
            if(square>x):
                return i-1;
        return -1;