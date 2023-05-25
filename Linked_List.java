public class Linked_List {
    Node head;
     static class  Node {
         int  data;
         Node next;

         Node(int data) {
             this.data = data;
             this.next = null;
         }
     }
        public  void addFirst(int data){
            Node newNode= new Node(data);
            if(head==null) {
                head = newNode;
                return;
            }
            newNode.next=head;
            head=newNode;

        }
        public void addLast(int data) {
         Node newNode = new Node(data);
         if(head==null){
             head=newNode;
             return;
        }
         Node currNode=head;
         while (currNode.next!=null){
             currNode=currNode.next;

         }
         currNode.next=newNode;
     }
     public void printList() {
       //  Node newNode =new Node(data);
         if(head==null){
             System.out.println("List is Empty!");
             return;
         }
         Node currNode=head;
         while (currNode!=null){
             System.out.print(currNode.data+"-> ");
             currNode=currNode.next;
         }
         System.out.println("Null");
     }
     public void reverseIterate(){
         Node prevNode=head;
         Node currNode =head.next;
         while (currNode!=null){
             Node nextNode = currNode.next;
             currNode.next=prevNode;

             //update
             prevNode=currNode;
             currNode=nextNode;
         }
         head.next=null;
         head=prevNode;
     }
     public int  reverseRecursive(Node head){
         int sum=0;
         if(head==null)
             return 0;
         while( head.next!=null && head.next.next!=null)
         {
             sum=sum+head.data;
             head=head.next.next;
         }
         if(head.next==null)
             sum+=head.data;
         else
             sum+=head.data;
         return sum;
     }


         public static void main(String[] args) {
            Linked_List list=new Linked_List();
            list.addFirst(5);
            list.addLast(6);
            list.addLast(9);
            list.addLast(1);
            list.addLast(3);
            //list.printList();
            list.reverseIterate();
           int s= list.reverseRecursive(list.head);
             System.out.println(s);
        }
    }
