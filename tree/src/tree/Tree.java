











package tree;

import java.util.Arrays;

public class Tree {

    /*void insert(String word, int linenr) {
         if (linenr >= 0){
             int[] linenum;
             linenum = new int[linenr];
         }
         
    }*/


    private class Node {

        String key;
        int[] value= new int[10];
        Node left;
        Node right;
    }
    private Node root;

    

    private void debugHelper(Node tree, int depth) {
        if (tree.right != null) { //recursive for right side
            debugHelper(tree.right, depth + 1);
        }

        for (int i = 0; i < depth; i++) { //prints indenation
            System.out.printf("  ");
        }

        System.out.println(depth + " " + tree.key); //prints deptha and key

        if (tree.left != null) { //recursive for left side
            debugHelper(tree.left, depth + 1);
        }
    }

    private void outputHelper(Node tree) {
        if (tree.right != null) { //recursive for right side
            outputHelper(tree.right);
        }

        System.out.print(tree.key + " : "); //prints key and colon
        arrayofInts(tree.value);
	System.out.println("");

        if (tree.left != null) { //recursive for left side
            outputHelper(tree.left);
        }
    }
    public void arrayofInts(int[] x){
      for (int i=0; i<x.length; i++){
          if (x[i]>0){
              System.out.print(x[i]+ " ");
          }
      }
        
    }
    

    public void insert(String key, int linenum) {
        // Insert a word into the tree
        if (root == null) { //if root is null, make a new node for the root
            Node n = new Node();
            n.key = key;
            n.value[0] = linenum;
            root = n;
        } else { //root is occupied
            Node current = root; //start at root
            Node parent;
            while (true) {
                parent = current;
                if (current.key.equals(key)) {
                    int i = 0;
                    while (current.value[i]>0){
                        i++;
                    }
                    current.value[i]=linenum;
                    return;
                } else if (current.key.compareTo(key) < 0) { //try left
                    current = current.left;
                    if (current == null) {
                        Node n = new Node();
                        n.key = key;
                        n.value[0]=linenum;
                        parent.left = n;
                        return;
                    }
                } //end left if
                else { //try right
                    current = current.right;
                    if (current == null) {
                        Node n = new Node();
                        n.key = key;
                        n.value[0]=linenum;
                        parent.right = n;
                        return;
                    }
                } //end right if
            } //end while
        } //end else not root

    } //end insert()

    public void debug() {
        // Show debug output of tree
        debugHelper(root, 0);
    }

    public void output() {
        // Show sorted words with lines where each word appears
        outputHelper(root);
        
    }
}