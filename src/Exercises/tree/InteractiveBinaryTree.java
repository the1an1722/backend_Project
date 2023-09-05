package Exercises.tree;

import java.util.Scanner;

class TreeNode {
    int value;
    TreeNode left;
    TreeNode right;

    public TreeNode(int value) {
        this.value = value;
        left = null;
        right = null;
    }
}

public class InteractiveBinaryTree {
    //  Insert a new value into the binary Exercises.tree
    //将新值插入二叉树
    public static TreeNode insert(TreeNode root, int value) {
        if (root == null) {
            return new TreeNode(value);
        }

        // If the value is less than the current node's value, recursively add to the left subtree
        // 如果值小于当前节点的值，则递归添加到左子树
        if (value < root.value) {
            root.left = insert(root.left, value);
        }
        // If the value is greater than the current node's value, recursively add to the right subtree
        // 如果值大于当前节点的值，则递归添加到右子树
        else if (value > root.value) {
            root.right = insert(root.right, value);
        }

        return root;
    }

    // Search for a value in the binary Exercises.tree
    // 在二叉树中搜索一个值
    public static TreeNode search(TreeNode root, int value) {
        if (root == null || root.value == value) {
            return root;
        }

        if (value < root.value) {
            return search(root.left, value);
        }

        return search(root.right, value);
    }

    // Delete a node with the specified value
    // 删除具有指定值的节点
    public static TreeNode delete(TreeNode root, int valueToDelete) {
        if (root == null) {
            return root;
        }

        // Check if the value to delete exists in the Exercises.tree
        // 检查要删除的值是否存在于树中
        TreeNode nodeToDelete = search(root, valueToDelete);
        if (nodeToDelete == null) {
            System.out.println("Value " + valueToDelete + " does not exist in the Exercises.tree. Cannot delete.");
            return root;
        }

        // If the value is less than the current node's value, recursively delete from the left subtree
        // 如果值小于当前节点的值，则递归从左子树删除
        if (valueToDelete < root.value) {
            root.left = delete(root.left, valueToDelete);
        }
        // If the value is greater than the current node's value, recursively delete from the right subtree
        // 如果值大于当前节点的值，则递归从右子树删除
        else if (valueToDelete > root.value) {
            root.right = delete(root.right, valueToDelete);
        } else {
            // Find the node with the matching value

            // If the node has only one child or no children
            // 如果节点只有一个子节点或没有子节点
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            // If the node has two children, find the maximum value in the left subtree
            // 如果节点有两个子节点，找到左子树中的最大值
            root.value = maxValue(root.left);

            // Delete the node with the maximum value from the left subtree
            // 从左子树中删除具有最大值的节点
            root.left = delete(root.left, root.value);
        }

        return root;
    }

    // Find the maximum value in the binary Exercises.tree
    // 查找二叉树中的最大值
    public static int maxValue(TreeNode node) {
        int maxValue = node.value;
        while (node.right != null) {
            maxValue = node.right.value;
            node = node.right;
        }
        return maxValue;
    }

    // Find the minimum value in the binary Exercises.tree
    // 查找二叉树中的最小值
    public static int minValue(TreeNode node) {
        int minValue = node.value;
        while (node.left != null) {
            minValue = node.left.value;
            node = node.left;
        }
        return minValue;
    }

    // Perform an inorder traversal and print the result
    // 执行中序遍历并输出结果
    public static void inorderTraversal(TreeNode root) {
        if (root != null) {
            inorderTraversal(root.left);
            System.out.print(root.value + " ");
            inorderTraversal(root.right);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TreeNode root = null;

        System.out.println("Interactive Binary Tree Example");
        while (true) {
            System.out.print("Enter a value to add to the binary Exercises.tree, 'delete' to remove a value, or 'exit' to quit: ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                break;
            } else if (input.equalsIgnoreCase("delete")) {
                System.out.print("Enter a value to delete from the binary Exercises.tree: ");
                int deleteValue = scanner.nextInt();
                scanner.nextLine(); // Consume the newline character

                // Check if the value to delete exists in the Exercises.tree
                // 检查要删除的值是否存在于树中
                TreeNode nodeToDelete = search(root, deleteValue);
                if (nodeToDelete == null) {
                    System.out.println("Value " + deleteValue + " does not exist in the Exercises.tree. Cannot delete.");
                } else {
                    root = delete(root, deleteValue);
                    System.out.println("Value " + deleteValue + " deleted from the Exercises.tree.");
                }
            } else {
                try {
                    int value = Integer.parseInt(input);
                    root = insert(root, value);
                    System.out.println("Value " + value + " added to the Exercises.tree.");
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter a valid integer.");
                }
            }

            // Print the binary Exercises.tree's inorder traversal result
            System.out.print("Current Binary Tree (Inorder traversal): ");
            inorderTraversal(root);
            System.out.println();
        }

        System.out.println("Program has exited.");
        scanner.close();
    }
}
