public class bt {
    static node  root;
    bt(int data){
        root=new node(data);
    }
    bt(){
       root=null;
   }
  public static void preorder(node data){
        if(data==null)
            return;
       System.out.print(data.data+" ");
       preorder(data.left);
      preorder(root.right);
   }

    public static void main(String[] args) {
        bt tree =new bt();
        tree.root=new node(30);
        tree.root.right= new node(1);  //                               1
        tree.root.left = new node(2);          //                 /           \
        //tree.root.right = new node(3);           //                 2             3
                //          /  \          /    \
        tree.root.left.right = new node(5);          //       4     5        6      7
        tree.root.right.left = new node(6);      //         /  \   /  \
        tree.root.right.right = new node(7);
        tree.root.left.left = new node(4);   //            8    9  10  11
        tree.root.left.left.left = new node(8);
        tree.root.left.left.right = new node(9);
        tree.root.left.right.left = new node(10);
        tree.root.left.right.right = new node(11);
        preorder(tree.root);
       // System.out.println(tree.root);
    }

}
class node{
    int data;
    node left,right;
    node(int data){
        this.data= data;
        this.left=null;
        this.right=null;
    }
}