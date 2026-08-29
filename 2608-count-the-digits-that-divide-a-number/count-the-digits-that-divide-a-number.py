class Solution:
    def countDigits(self, num: int) -> int:
        digits = []
        temp = num
        while(num>0):
            digits.append(num%10)
            num = num//10           #not num/10 since that will return float: 7/10 => 0.7/10 => 0.07 <- always > 0
        c = 0;
        for i in digits:
            if temp%i==0: c+=1;
        return c;
        