class Solution:
    def calPoints(self, operations: List[str]) -> int:
        stack = []
        res = 0
        for operation in operations:
            if operation.lstrip('-').isdigit():
                stack.append(int(operation))
            else:
                if operation == "+":
                    a = stack.pop()
                    b = stack[-1]
                    stack.append(a)
                    stack.append(a + b)
                if operation == "D":
                    stack.append(stack[-1] * 2)
                if operation == "C":
                    stack.pop()
        sum = 0
        while stack:
            sum += stack.pop()

        return sum