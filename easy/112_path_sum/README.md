# path sum
Given the `root` of a binary tree and an integer `targetSum`, return `true` if the tree has a 
**root-to-leaf**  path such that adding up all the values along the path equals `targetSum`.

A **leaf** is a node with no children.

#### example 1:
![path sum](pathsum1.jpeg)
> **input:** root = [5,4,8,11,null,13,4,7,2,null,null,null,1], targetSum = 22  
> **output:** true  
> **explanation:** the root-to-leaf path with the target sum is shown.

#### example 2:
![path sum](pathsum2.jpeg)
> **input:** root = [1,2,3], targetSum = 5  
> **output:** false  
> **explanation:** there two root-to-leaf paths in the tree:  
> (1 --> 2): The sum is 3.  
> (1 --> 3): The sum is 4.  
> there is no root-to-leaf path with sum = 5.  

#### example 3:
> **input:** root = [], targetSum = 0  
> **output:** false  
> **explanation:** since the tree is empty, there are no root-to-leaf paths.
