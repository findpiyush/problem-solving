class Solution:
    def isPowerOfTwo(self, n: int) -> bool:
        if n == 1:
            return True
        i = 0
        while ( pow(2, i) <= n ):  # it grows exponentially so dont do _ in range(0,n+1) or range(0,n//2+1)
            if pow(2, i) == n:
                return True
            i += 1

        return False
