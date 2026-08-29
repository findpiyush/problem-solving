class Solution:
    def kidsWithCandies(self, candies: List[int], extraCandies: int) -> List[bool]:
        max_ = 0
        
        result = []
        for i in candies:
            if i>max_:
                max_ = i
    
        for i in candies:
            if i+extraCandies>=max_:
                #print(i,extraCandies,max_, "true")
                result.append(True)
            else:
                #print(i,extraCandies,max_,"False")
                result.append(False)
        return result
        