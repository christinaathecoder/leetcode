# valid parentheses
Given a string `s` containing just the characters `'(', ')', '{', '}', '[' and ']'`, determine if the input string is valid.  

An input string is valid if:  
* Open brackets must be closed by the same type of brackets.
* Open brackets must be closed in the correct order.
 
#### example 1:
> **input:** s = "()"  
> **output:** true

#### example 2:
> **input:** s = "()[]{}"  
> **output:** true

#### example 3:
> **input:** s = "(]"  
> **output:** false

#### example 4:
> **input:** s = "([)]"  
> **output:** false

#### example 5:
> **input:** s = "{[]}"  
> **output:** true

#### constraints:
* `1 <= s.length <= 104`
* `s` consists of parentheses only '()[]{}'.

**source:** https://leetcode.com/problems/valid-parentheses/
