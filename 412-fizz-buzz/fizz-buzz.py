class Solution(object):
    def fizzBuzz(self, n):
        """
        :type n: int
        :rtype: List[str]
        """
        result = []
        for _ in range(1,n+1):
            if(_%3==0 and _%5==0):
                result.append("FizzBuzz") 
            elif (_%3 == 0):
                result.append("Fizz")
            elif (_%5 == 0):
                result.append("Buzz")
            else:
                result.append(str(_))
        
        return result

        