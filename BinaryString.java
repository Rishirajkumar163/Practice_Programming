import com.sun.source.tree.BinaryTree;

public class BinaryString {
   static class Node{
        String data;
        Node left;
        Node right;
        public Node(String data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    Node root;
    BinaryString(){
        root=null;
    }
    BinaryString(String data){
        root=new Node(data);
    }
    public static void preorder(Node root){
        if(root==null)
            return;

        preorder(root.left); System.out.print(root.data);
        preorder(root.right);
    }

    public static void main(String[] args) {
       // String []a={"R","I","S","H","I","R","A","J"};
        BinaryString tree=new BinaryString();
        tree.root=new Node("R");
        tree.root.left=new Node("I");
        tree.root.left.left=new Node("S");
        tree.root.left.left.left=new Node("H");
        tree.root.left.left.left.left=new Node("I");
        preorder(tree.root);
    }
}
