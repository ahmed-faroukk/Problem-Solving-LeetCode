public class node {
    int data ;
    node left ;
    node right ;

    public node(int data) {
        this.data = data;
    }
}
public class Main {
    public static void main(String[] args) {
        // Our example tree looks like this:
        //         2
        //       /   \
        //      3     4
        //     / \
        //    5   6
        // sum is 20
        node node2 = new node(2);
        node node3 = new node(3);
        node node4 = new node(4);
        node node5 = new node(5);
        node node6 = new node(6);
        node2.right = node4;
        node2.left = node3;
        node3.right = node6;
        node3.left = node5;
        System.out.println(find_sum(node2));


    }

    public static int find_sum(node root){
        if (root==null)
            return 0 ;
        return root.data + find_sum(root.left) + find_sum(root.right);
    }
}
