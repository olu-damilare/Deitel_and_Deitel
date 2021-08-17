package chapterTwentyOne;

public class Tree<T extends Comparable<T>> {
    private TreeNode<T> root;

    public void insert(T value){
        if(root == null) root = new TreeNode<T>(value);
        else root.insert(value);
    }

    public void preorderTraversal(){
        preorderHelper(root);
    }

    private void preorderHelper(TreeNode<T> node) {
        if (node == null) return;
        System.out.print(node.data + " ");
        preorderHelper(node.leftNode);
        preorderHelper(node.rightNode);

    }

    private void inorderTraversal(){
        inorderHelper(root);
    }

    private void inorderHelper(TreeNode<T> node) {
        if(node == null) return;
        inorderHelper(node.leftNode);
        System.out.print(node.data + " ");
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

    public boolean contains(T value){
       return containHelper(root, value);
    }

    private boolean containHelper(TreeNode<T> node, T value){
        if(node == null) return false;
        if(node.data == value) return true;
         boolean exists = containHelper(node.leftNode, value);
        if(exists) return true;
        return containHelper(node.rightNode, value);
    }





}
