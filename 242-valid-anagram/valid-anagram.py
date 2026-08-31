class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if len(s) != len(t): return False

        #hashmap
        countS, countT = {},{}

        # build the hashmap
        for i in range(len(s)):
            countS[s[i]] = 1 + countS.get(s[i], 0) # 0 is the default value it will return incase character doesnt exist in the string
            countT[t[i]] = 1 + countT.get(t[i], 0)

        #compare counts of both hashmaps
        for char in countS:
            if countS[char] != countT.get(char,0): # instead of countT[char], incase key doesnt exist in countT we dont want an error
                return False
        return True

        