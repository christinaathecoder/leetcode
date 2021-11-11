# length of last word
given a string `s` consisting of some words separated by some number of spaces, return the length of the last word in the string.
a word is a maximal substring consisting of non-space characters only.

#### example 1:
> **input:** s = "Hello World"  
> **output:** 5  
> **explanation:** the last word is "World" with length 5.

#### example 2:
> **input:** s = "   fly me   to   the moon  "  
> **output:** 4  
> **explanation:** the last word is "moon" with length 4.

#### example 3:
> **input:** s = "luffy is still joyboy"  
> **output:** 6  
> **explanation:** the last word is "joyboy" with length 6.

#### constraints:
* `1 <= s.length <= 104`
* `s` consists of only English letters and spaces ' '.
* there will be at least one word in `s`.

**source:** https://leetcode.com/problems/length-of-last-word/
