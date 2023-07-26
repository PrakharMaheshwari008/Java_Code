package Linked_List;

public class entire_Concept_of_Insertion_delection {
    public static void main(String[] args) {
        LL_Insertion list = new LL_Insertion();
        list.insertionFirst(2);
        list.insertionFirst(6);
        list.insertionFirst(12);
        list.insertionFirst(15);
        list.insertionFirst(15);
        list.insertionFirst(20);
        list.insertionlast(15);
        list.insertionlast(49);
        list.insert_at_pos(13,2);
        list.display();
        list.insertRec(35,2);
        list.insertRec(25,2);
//        list.remove_choose_val(he15);
        list.display();


        list.display();
//  ########################################################################################
////        *****************************  Code of execution of deletion  ***********************
//        System.out.println(list.deletefirst());
//        list.display();
//        System.out.println(list.deletelast());
//        list.display();
//        list.delete(3);
//        list.display();

//#########################################################################################
//       ****************************  code for double Linked list  ************************
//        Doubly_linked DL = new Doubly_linked();
//        DL.insertfirst(1);
//        DL.insertfirst(3);
//        DL.insertfirst(5);
//        DL.insertfirst(7);
//        DL.insertAtPos(20,4);
//        DL.insertlast(49);
//        DL.insertlast(59);
//        DL.insertAfterValue(7,6);
//        DL.insertlast(69);
//        DL.display();

        //       ****************************  code for Circular Linked list  ************************

//        Circular_LL C_LL = new Circular_LL();
//        C_LL.insertion(3);
//        C_LL.insertion(35);
//        C_LL.insertion(63);
//        C_LL.insertion(33);
//        C_LL.insertion(83);
////        C_LL.display();
//        C_LL.delete(63);
//        C_LL.display();

     LL_Insertion LLrec   = new LL_Insertion();
     LLrec.insertRec(23,2);
     LLrec.display();

    }
}
