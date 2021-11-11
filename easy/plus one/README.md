# plus one
you are given a large integer represented as an integer array digits, where each `digits[i]` is the ith digit of the integer. 
the digits are ordered from most significant to least significant in left-to-right order. the large integer does not contain any leading 0's.

increment the large integer by one and return the resulting array of digits.

#### example 1:
> **input:** digits = [1,2,3]  
> **output:** [1,2,4]  
> **explanation:** the array represents the integer 123.
incrementing by one gives 123 + 1 = 124.
thus, the result should be [1,2,4].

#### example 2:
> **input:** digits = [4,3,2,1]  
> **output:** [4,3,2,2]  
> **explanation:** the array represents the integer 4321.
incrementing by one gives 4321 + 1 = 4322.
thus, the result should be [4,3,2,2].

#### example 3:
> **input:** digits = [0]  
> **output:** [1]  
> **explanation:** the array represents the integer 0.
incrementing by one gives 0 + 1 = 1.
thus, the result should be [1].

#### example 4:
> **input:** digits = [9]  
> **output:** [1,0]  
> **explanation:** the array represents the integer 9.
incrementing by one gives 9 + 1 = 10.
thus, the result should be [1,0].
 
#### constraints:
* `1 <= digits.length <= 100`
* `0 <= digits[i] <= 9`
* digits does not contain any leading 0's.

**source:** https://leetcode.com/problems/plus-one/
