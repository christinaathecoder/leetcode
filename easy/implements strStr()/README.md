# implement strStr()
Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

**clarification:**  
What should we return when needle is an empty string? This is a great question to ask during an interview.  
For the purpose of this problem, we will return 0 when needle is an empty string. This is consistent to C's `strstr()` and Java's `indexOf()`.

#### example 1:
> **input:** haystack = "hello", needle = "ll"  
> **output:** 2

#### example 2:
> **input:** haystack = "aaaaa", needle = "bba"  
> **output:** -1

#### example 3:
> **input:** haystack = "", needle = ""  
> **output:** 0
 
#### constraints:
* `0 <= haystack.length, needle.length <= 5 * 104`
* haystack and needle consist of only lower-case English characters.

**source:** https://leetcode.com/problems/implement-strstr/
