package Tree_Data_Structure.Binary_Search_tree;

public class _create_n_Insert__build_tree_BST {
    public static void main(String[] args) {
//        int[] values = {8,5,3,1,4,6,10,11,14};
//        int[] values = {8, 3, 10, 1, 6, -1, 14, -1, -1, 4, 7, 13, -1, -1, -1, -1, -1, -1, -1};

//        int[] values = {5,1,0,3,2,4,7};
        int[] values = {5,3,6,2,4,7};
//        int[] values = {134, 37, 369, 334, 304, 249 ,499, 190, 530, 568, 747, 649, 755, 754, 809, 529, 891, 959, 909, 873, 869, 843 };
//        int[] values = {2, -1, 7, -1, 6, -1, 5, -1, 9, -1, 3, -1, 6};
        Node root = null;
        for (int i = 0 ;i < values.length;i++)
        {
            root = insert(root,values[i]);
        }
//        InOrder(root);
//__________________ below line is for check is element is present or not _______
//        System.out.println(search_data(root, 41));
//                    Or
//        if (search_data(root,4))
//        {
//            System.out.println("Found");
//        }
//        else {
//            System.out.println("Not found");
//        }
//        ********************* Deletion _Call ***********************
        deletion(root,7);
        System.out.println();
//        ***************InOrder **************************
//        System.out.println();

      InOrder(root);
//        System.out.println(root);
//        postorder(root);

        System.out.println();

//        *******************************************
//        print_in_range(root,2,5);

//        **************************************************
        System.out.println(Is_Binary_or_Not(root));
//        **************************************************

        System.out.println(minValue(root));

//        findPreSuc(root,);

    }
//    *************************************************

    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }
    public static Node insert(Node root,int val_insert) {
        if (root == null){
            root = new Node(val_insert);
            return root;
        }
//        here Data (val_insert) to be inserted is smaller than root.data then go left side
        if (root.data > val_insert)
        { // root.left is Indicate that reference of the data that inserted on left side store in the same
            root.left = insert(root.left,val_insert);
        }
//        if (root.data < val_insert)
        else
        { // root.right is Indicate that reference of the data that inserted on right side store in the same
            root.right = insert(root.right,val_insert);
        }
        return root;
    }

    public static boolean search_data(Node root, int val_search) {
        if (root == null) {
            return false;
        }
        if (root.data > val_search) {
            return search_data(root.left,val_search);
        }
        if (root.data < val_search) {
            return search_data(root.right,val_search);
        }
        return true;
    }
//********************************************************* **************************
    public static Node deletion(Node root,int del_val) {
        if (root == null) {
//            System.out.println("Tree Having No data");
            return root;
        }
        if(root.data > del_val ) {
           root.left = deletion(root.left,del_val);
        }
       else if(root.data < del_val ) {
           root.right = deletion(root.right,del_val);
        }
       else{
//           Case. 1 = root.data == val; (delete last node of the tree)
            if (root.left == null && root.right == null) {
                return null;
            }
//            Case 2. (Delete node which having one child)
            if (root.left == null) {
                return root.right;
            }
            else if (root.right == null) {
                return root.left;
            }
//            case : 3
            Node Is = inOrder_Succcessor(root.right);  // firstly found in Inder_successor from right node of true value(deleted value)
            root.data = Is.data;
            root.right = deletion(root.right, Is.data);
        }
        return root;
    }

    private static Node inOrder_Succcessor(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

//    Ques _ print_in_Range _________________________________
    public static void print_in_range(Node root,int x,int y)
    {
        if (root == null)
        {
            return;
        }
        if (root.data >= x && root.data <= y)
        {
            print_in_range(root.left,x,y);
            System.out.print(root.data+ " ");
            print_in_range(root.right,x,y);
        } else if (root.data >= y) {
            print_in_range(root.left,x,y);
        }
        else {
            print_in_range(root.right,x,y);
        }
    }

//**********************************************************************
public static Node InOrder(Node root) {
    if (root == null) {
        return root;
    }
    if (root.data == -1){
        return root;
    }
    InOrder(root.left);
    System.out.print(root.data+" ");
    InOrder(root.right);
    return root;
}
    public static void postorder(Node root){
        if(root == null){
            return;
        }
        if (root.data == -1){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }


//
//********************************************************* **************************


    public static boolean Is_Binary_or_Not(Node root) {
        if (root == null) {
            return false;
        }
        if (root.data > root.right.data) {
            Is_Binary_or_Not(root.left);
            return false;
        }
        if (root.data < root.left.data) {
            Is_Binary_or_Not(root.right);
            return false;
        }
        return true;
    }

//    ********************* find_Min_Value **************************************
       static int val = Integer.MAX_VALUE;

    static int minValue(Node root) {
            if(root == null){
                return 0;
            }


            if(root.data < val){
                val = root.data;
            }

            minValue(root.left);
            minValue(root.right);
            return val;
        }
//        ********************************************************************
public static void findPreSuc(Node root, Node p, Node s, int key)
{
    p.left = findpre(root,key);
    s.right = findsuc(root,key);

}
    static Node findpre(Node root,int t){
        Node pre = null;
        while(root!= null){
            if(root.data >=t){
                root = root.left;
            }
            else{
                pre = root;
                root = root.right;
            }
        }
        return pre;
    }


    static Node findsuc(Node root,int t){
        Node suc = null;
        while(root!= null){
            if(root.data <= t){
                root = root.right;
            }
            else{
                suc = root;
                root = root.left;
            }
        }
        return suc;
    }
}