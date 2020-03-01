/* 

    class Node 
       int data;
       Node left;
       Node right;
 */
void levelOrder(Node root) {
    Queue<Node> queue = new ArrayDeque<Node>();
    queue.add(root);
    System.out.print(root.data);
    System.out.print(" ");
    
    while(true){
        if(queue.peek() == null) return;
        else root = queue.poll();
        if(root.left != null){
            queue.add(root.left);
            System.out.print(root.left.data);
            System.out.print(" ");
        }
        if(root.right != null){
            queue.add(root.right);
            System.out.print(root.right.data);
            System.out.print(" ");
        }
    }
}

