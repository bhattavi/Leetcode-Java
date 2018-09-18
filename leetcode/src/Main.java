import sun.plugin2.os.windows.FLASHWINFO;

import java.util.*;

public class Main {

    public TreeNode convertBST(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        int sum = 0;
        TreeNode node = root;
        while (!stack.isEmpty() || node != null) {
            if (node != null) {
                stack.push(node);
                node = node.right;
            } else {
                node = stack.pop();
                int s = sum;
                sum += node.val;
                node.val += s;
                node = node.left;
            }
        }
        return root;
    }

    public static void main(String[] args) {
    }
}
