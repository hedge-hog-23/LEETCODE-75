class Solution:
    def decodeString(self, s: str) -> str:
        stack = [["",1]]
        num = ""
        nums = [str(x) for x in range(0,10)]

        for i in s:
            if(i in nums):
                num+=i
            elif(i == '['):
                stack.append(["",int(num)])
                num = ""
            elif(i == "]"):
                st,ct = stack.pop()
                stack[-1][0] += st * ct
            else:
                stack[-1][0] +=i
        
        return stack[-1][0]
