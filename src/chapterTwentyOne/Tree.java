package chapterTwentyOne;

import java.util.ArrayDeque;
import java.util.Queue;

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

    public int getDepth(){
        return depthHelper(root);
    }

    public int depthHelper(TreeNode<T> node){
        if(node == null) return -1;
        if(root.leftNode == null) return 0;
        if(root.rightNode == null) return 0;

        return 1 + Math.max(depthHelper(node.leftNode), depthHelper(node.rightNode));
    }


    public T getData(T key) {
        return getDataHelper(root, key);
    }

    private T getDataHelper(TreeNode<T> node, T key) {
        if(node == null) return null;
        if(node.data == key) return node.data;
        T data = getDataHelper(node.leftNode, key);
        if(data != null) return data;
       return getDataHelper(node.rightNode, key);
    }

    public void levelOrderTraversal() {
       int level = 1;
       while(printCurrentLevel(root, level)){
           level++;
       }
    }

    private boolean printCurrentLevel(TreeNode<T> node, int height) {
        if(node == null) return false;
        if(height == 1){
            System.out.print(node.data + " ");
            return true;
        }
        boolean left = printCurrentLevel(node.leftNode, height - 1);
        boolean right = printCurrentLevel(node.rightNode, height - 1);

        return left || right;
    }
}
