# summary ranges
you are given a sorted unique integer array `nums`.

return the smallest sorted list of ranges that cover all the numbers in the array exactly. 
that is, each element of nums is covered by exactly one of the ranges, and there is no integer `x` such that `x` is in one of the ranges but not in `nums`.

each range `[a,b]` in the list should be output as:  
* `"a->b"` if `a != b`  
* `"a"` if `a == b`  
 
#### example 1:
> **input:** nums = [0,1,2,4,5,7]  
> **output:** ["0->2","4->5","7"]  
> **explanation:** the ranges are:  
[0,2] --> "0->2"  
[4,5] --> "4->5"  
[7,7] --> "7"  

#### example 2:
> **input:** nums = [0,2,3,4,6,8,9]  
> **output:** ["0","2->4","6","8->9"]  
> **explanation:** the ranges are:  
[0,0] --> "0"  
[2,4] --> "2->4"  
[6,6] --> "6"  
[8,9] --> "8->9"

#### example 3:
> **input:** nums = []  
> **output:** []

#### example 4:
> **input:** nums = [-1]  
> **output:** ["-1"]

#### example 5:
> **input:** nums = [0]  
> **output:** ["0"]
 
#### constraints:
* `0 <= nums.length <= 20` 
* `-2^31 <= nums[i] <= 2^31 - 1`
* all the values of `nums` are unique.
* `nums` is sorted in **ascending order**.

**source:** https://leetcode.com/problems/summary-ranges/
