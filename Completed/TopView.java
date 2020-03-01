

void topView(Node root) {
    Node node = null;
    Queue<Node> queue = new ArrayDeque<Node>();
    queue.add(root);
    System.out.println(queue.peek().data);
    
    while(true){
        int size = queue.size();
        int counter = 0;
        for(int i = 0; i < size; i++){
            if(queue.peek().left != null){
                node = queue.peek().left;
            }
            if(node != null && counter == 0) {
                System.out.print(String.valueOf(node.data) + " ");
                counter++;
            }
            queue.add(queue.peek().left);
            if(queue.peek().right != null){
                node = queue.peek().right;
            }
            if(node != null && counter == 0) {
                System.out.print(String.valueOf(data) + " ");
                counter++;
            }
            queue.add(queue.poll().right);
        }
        System.out.print(String.valueOf(node.data) + " ");
    }
}
*****************************************************************************

#Code below is almost done!!!!!!!!!
#You have to think about deepest child doesn't matter for "Top View Tree
#Problem"!!!!!

void topView(Node root) {
    Node node = root;
    Node lastNode = root;
    Queue<Node> queue = new ArrayDeque<Node>();
    queue.add(root);
    System.out.print(String.valueOf(root.data) + " ");
    
    while(true){
        int size = queue.size();
        int counter = 0;
        for(int i = 0; i < size; i++){
            node = queue.peek().left;
            if(node != null){
                if(counter == 0){
                    System.out.print(String.valueOf(node.data) + " ");
                    counter++;
                }
                queue.add(queue.peek().left);
                lastNode = node.left;
            }
            node = queue.peek().right;
            if(node != null){
                if(counter == 0){
                    System.out.print(String.valueOf(node.data) + " ");
                    counter++;
                }
                queue.add(queue.poll().right);
                lastNode = node.right;
            }
        }
        if(node == null){
            System.out.print(String.valueOf(lastNode.data) + " ");
        }
    }
}
************************************************************
The problem is that you just have to print outer of the tree...
That is boring me! So you should keep thinking about "Real" TopTree problem..


https://www.hackerrank.com/challenges/tree-top-view/problem
