class Solution:

    def runningSum(self, nums: List[int]) -> List[int]:
        sum=[]
        for i in range(1,len(nums)+1):

            temp = 0
            for j in range(0,i):
                temp += nums[j]
            sum.append(temp)
        return sum

            
        