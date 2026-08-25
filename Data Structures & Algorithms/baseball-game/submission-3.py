class Solution:
    def calPoints(self, operations: List[str]) -> int:
        stack = []
        for operation in operations:
            if operation.lstrip('-').isdigit():
                stack.append(int(operation))
                print(stack)
            else:
                if operation == "+":
                    a = stack.pop()
                    b = stack[-1]
                    stack.append(a)
                    stack.append(a + b)
                    print(stack)
                if operation == "D":
                    stack.append(stack[-1] * 2)
                    print(stack)
                if operation == "C":
                    stack.pop()
                    print(stack)
        sum = 0
        while stack:
            sum += stack.pop()

        return sum