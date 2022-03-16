import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinDepthOfBinaryTreeTest {
    @Test
    void minDepthTest1() {
        TreeNode root = new TreeNode(3, new TreeNode(9),
                new TreeNode(20, new TreeNode(15), new TreeNode(7)));
        assertEquals(2, MinDepthOfBinaryTree.minDepth(root));
    }

    @Test
    void minDepthTest2() {
        TreeNode root = new TreeNode(2);
        root.right = new TreeNode(3);
        root.right.right = new TreeNode(4);
        root.right.right.right = new TreeNode(5);
        root.right.right.right.right = new TreeNode(6);
        assertEquals(5, MinDepthOfBinaryTree.minDepth(root));
    }
}