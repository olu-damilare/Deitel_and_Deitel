package chapterTwentyOne;

public class Tree<T extends Comparable<T>> {
    private TreeNode<T> root;

    public void insertNode(T value){
        if(root == null) root = new TreeNode<T>(value);
        else root.insert(value);
    }

    public void preorderTraversal(){
        preorderHelper(root);
    }

    private void preorderHelper(TreeNode<T> node) {
        if (node == null) return;
        System.out.println(node.data + " ");
        preorderHelper(node.leftNode);
        preorderHelper(node.rightNode);

    }

    private void inorderTraversal(){
        inorderHelper(root);
    }

    private void inorderHelper(TreeNode<T> node) {
        if(node == null) return;
        inorderHelper(node.leftNode);
        System.out.println(node.data + " ");
        inorderHelper(node.rightNode);
    }

    public void postorderTraversal(){
        postorderHelper(root);
    }

    private void postorderHelper(TreeNode<T> node) {
        if(node == null) return;
        postorderHelper(node.leftNode);
        postorderHelper(node.rightNode);
        System.out.println(node.data + " ");

    }

}
