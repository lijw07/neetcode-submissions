class Solution:
    def isValid(self, s: str) -> bool:
        stack = []

        for val in s:
            if stack:
                if val == "]" and stack[-1] == "[":
                    stack.pop()
                    continue
                if val == "}" and stack[-1] == "{":
                    stack.pop()
                    continue
                if val == ")" and stack[-1] == "(":
                    stack.pop()
                    continue
            stack.append(val)
        if not stack:
            return True
        return False