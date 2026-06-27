package Trees;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class Traversals {
    
    // public static void inorder(TreeNode root) {
    //     if(root == null) return;

    //     inorder(root.left);
    //     System.out.println(root.val + " ");
    //     inorder(root.right);
    // }

    public static void inorder(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        TreeNode curr = root;

        while(curr != null || !stack.isEmpty()) {
            while(curr != null) {
                stack.push(curr);
                curr = curr.left;
            }

            curr = stack.pop();
            System.out.println(curr.val + " ");
            curr = curr.right;
        }
    }

    // public static void preorder(TreeNode root) {
    //     if(root == null) return;

    //     System.out.println(root.val + " ");
    //     preorder(root.left);
    //     preorder(root.right);
    // }

    public static void preorder(TreeNode root) {
        if (root == null) return;

        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            TreeNode curr = stack.pop();
            System.out.println(curr.val + " ");

            if (curr.right != null) {
                stack.push(curr.right);
            }

            if (curr.left != null) {
                stack.push(curr.left);
            }
        }
    }

    // public static void postorder(TreeNode root) {
    //     if(root == null) return;

    //     postorder(root.left);
    //     postorder(root.right);
    //     System.out.println(root.val + " ");
    // }

    public static void postorder(TreeNode root) {
        if (root == null) return;

        Stack<TreeNode> stack1 = new Stack<>();
        Stack<TreeNode> stack2 = new Stack<>();

        stack1.push(root);

        while (!stack1.isEmpty()) {
            TreeNode curr = stack1.pop();
            stack2.push(curr);

            if (curr.left != null) {
                stack1.push(curr.left);
            }

            if (curr.right != null) {
                stack1.push(curr.right);
            }
        }

        while (!stack2.isEmpty()) {
            System.out.println(stack2.pop().val + " ");
        }
    }

    public static void levelOrder(TreeNode root) {
        if(root == null) return;

        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.offer(root);

        while(!queue.isEmpty()) {

            int size = queue.size();

            for(int i = 0; i < size; i++) {
                TreeNode current = queue.poll();
                System.out.print(current.val + " ");

                if(current.left != null) {
                    queue.offer(current.left);
                }

                if(current.right != null) {
                    queue.offer(current.right);
                }
            }

            System.out.println();
        }
    }

}
