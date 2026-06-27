package Trees;

public class Main {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        System.out.println("Tree created successfully!");
        System.out.println("Inorder Traversal:");
        Traversals.inorder(root);
        System.out.println("Preorder Traversal:");
        Traversals.preorder(root);
        System.out.println("Postorder Traversal:");
        Traversals.postorder(root);

        System.out.println("Level Order Traversal:");
        Traversals.levelOrder(root);
    }
}
