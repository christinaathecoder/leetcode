# happy number

write an algorithm to determine if a number `n` is happy.

a happy number is a number defined by the following process:
* starting with any positive integer, replace the number by the sum of the squares of its digits.  
* repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1.
* those numbers for which this process ends in 1 are happy.
* return `true` if `n` is a happy number, and `false` if not.

#### example 1: 
> **input:** n = 19  
> **output:** true  
> **explanation:**  
1<sup>2</sup> + 9<sup>2</sup> = 82  
8<sup>2</sup> + 2<sup>2</sup> = 68  
6<sup>2</sup> + 8<sup>2</sup> = 100  
1<sup>2</sup> + 0<sup>2</sup> + 0<sup>2</sup> = 1  

#### example 2:
> **input:** n = 2  
> **output:** false
 
#### constraints:
* `1 <= n <= 2^31 - 1`

**source:** https://leetcode.com/problems/happy-number/
