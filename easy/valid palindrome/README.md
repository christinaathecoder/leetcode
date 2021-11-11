# valid palindrome
a phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. 
alphanumeric characters include letters and numbers.

given a string `s`, return true if it is a palindrome, or false otherwise.

#### example 1:
> **input:** s = "A man, a plan, a canal: Panama"  
> **output:** true  
> **explanation:** "amanaplanacanalpanama" is a palindrome.

#### example 2:
> **input:** s = "race a car"  
> **output:** false  
> **explanation:** "raceacar" is not a palindrome.

#### example 3:
> **input:** s = " "  
> **output:** true  
> **explanation:** `s` is an empty string "" after removing non-alphanumeric characters.
since an empty string reads the same forward and backward, it is a palindrome.
 

#### constraints:
* `1 <= s.length <= 2 * 105`
* `s` consists only of printable ASCII characters.

**source:** https://leetcode.com/problems/valid-palindrome/
