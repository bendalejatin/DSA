//Practical 6: Implementation of Binary Search Trees.

class TreeNode {
    int val;
    TreeNode left, right;

    public TreeNode(int key) {
        val = key;
        left = right = null;
    }
}

class BinarySearchTree {
    TreeNode root;

    public BinarySearchTree() {
        root = null;
    }

    public TreeNode insert(TreeNode root, int key) {
        if (root == null) {
            return new TreeNode(key);
        }
        if (key < root.val) {
            root.left = insert(root.left, key);
        } else {
            root.right = insert(root.right, key);
        }
        return root;
    }

    public TreeNode delete(TreeNode root, int key) {
        if (root == null) {
            return root;
        }
        if (key < root.val) {
            root.left = delete(root.left, key);
        } else if (key > root.val) {
            root.right = delete(root.right, key);
        } else {
            if (root.left == null) {
                TreeNode temp = root.right;
                root = null;
                return temp;
            } else if (root.right == null) {
                TreeNode temp = root.left;
                root = null;
                return temp;
            }
            TreeNode temp = minValueNode(root.right);
            root.val = temp.val;
            root.right = delete(root.right, temp.val);
        }
        return root;
    }

    public TreeNode minValueNode(TreeNode node) {
        TreeNode current = node;
        while (current.left != null) {
            current = current.left;
        }
        return current;
    }

    public TreeNode search(TreeNode root, int key) {
        if (root == null || root.val == key) {
            return root;
        }
        if (root.val < key) {
            return search(root.right, key);
        }
        return search(root.left, key);
    }

    public void inorderTraversal(TreeNode root) {
        if (root != null) {
            inorderTraversal(root.left);
            System.out.print(root.val + " ");
            inorderTraversal(root.right);
        }
    }

    public void preorderTraversal(TreeNode root) {
        if (root != null) {
            System.out.print(root.val + " ");
            preorderTraversal(root.left);
            preorderTraversal(root.right);
        }
    }

    public void postorderTraversal(TreeNode root) {
        if (root != null) {
            postorderTraversal(root.left);
            postorderTraversal(root.right);
            System.out.print(root.val + " ");
        }
    }
}

public class practical6 {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.root = bst.insert(bst.root, 50);
        bst.insert(bst.root, 30);
        bst.insert(bst.root, 20);
        bst.insert(bst.root, 40);
        bst.insert(bst.root, 70);
        bst.insert(bst.root, 60);
        bst.insert(bst.root, 80);

        System.out.println("Inorder traversal:");
        bst.inorderTraversal(bst.root);
        System.out.println("\nPreorder traversal:");
        bst.preorderTraversal(bst.root);
        System.out.println("\nPostorder traversal:");
        bst.postorderTraversal(bst.root);

        // Deleting node 20
        bst.delete(bst.root, 20);
        System.out.println("\nAfter deleting 20, Inorder traversal:");
        bst.inorderTraversal(bst.root);
    }
}
