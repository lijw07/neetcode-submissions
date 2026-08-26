class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if len(s) != len(t):
            return False
        
        sorted_s = "".join(sorted(s))
        sorted_t = "".join(sorted(t))
        
        for str1, str2 in zip(sorted_s, sorted_t):
            if str1 != str2:
                return False

        return True