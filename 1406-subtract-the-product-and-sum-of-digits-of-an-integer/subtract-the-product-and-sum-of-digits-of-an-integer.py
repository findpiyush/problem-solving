class Solution:
    def subtractProductAndSum(self, n: int) -> int:
        sum_ = 0
        prod = 1
        while n>0:
            t = n%10;
            sum_ +=t
            prod *=t
            n//=10
        return prod-sum_