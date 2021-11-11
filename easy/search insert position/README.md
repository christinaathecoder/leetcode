# search insert position
given a sorted array of distinct integers and a target value, return the index if the target is found. 
if not, return the index where it would be if it were inserted in order.

you must write an algorithm with `O(log n)` runtime complexity.

#### example 1:
> **input:** nums = [1,3,5,6], target = 5  
> **output:** 2

#### example 2:
> **input:** nums = [1,3,5,6], target = 2  
> **output:** 1

#### example 3:
> **input:** nums = [1,3,5,6], target = 7  
> **output:** 4

#### example 4:
> **input:** nums = [1,3,5,6], target = 0  
> **output:** 0

#### example 5:
> **input:** nums = [1], target = 0  
> **output:** 0

#### constraints:
* `1 <= nums.length <= 104`
* `-104 <= nums[i] <= 104`
* `nums` contains distinct values sorted in **ascending order**.
* `-104 <= target <= 104`

**source:** https://leetcode.com/problems/search-insert-position/
