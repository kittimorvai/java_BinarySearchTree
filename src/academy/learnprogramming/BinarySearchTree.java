package academy.learnprogramming;

public class BinarySearchTree {
        Node root;

        BinarySearchTree(){
            root = null;
        }

    class Node {
        int key;
        Node left;
        Node right;

        public Node(int key) {
            this.key = key;
            this.left = null;
            this.right = null;
        }
    }




        private Node add (Node root, int key){
            if (root == null){
                root = new Node(key);
            }
            if (key < root.key){
                root.left = add(root.left, key);
            } else if (key > root.key){
                root.right = add(root.right, key);
            } else {
                System.out.println("No duplicate keys are allowed");
            }
            return root;
    }


        public void insert (int key){
            root = add(root, key);
        }


        private void print (Node root){
            if (root != null){
                print(root.left);
                System.out.println(root.key);
                print(root.right);
            }
        }

        public void addItem (){
            print(root);
        }


}
