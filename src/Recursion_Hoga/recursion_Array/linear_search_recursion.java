package Recursion_Hoga.recursion_Array;

import java.util.ArrayList;
import java.util.Scanner;

public class linear_search_recursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int index = sc.nextInt();
        int[] arr = new int[index];

        for (int i = 0; i < index;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter target element");
        int target = sc.nextInt();

//
//        System.out.println(linaer_search_func(arr, target, 0));
//        System.out.println(linaer_search_func(arr, target, index));
//        findAllIndex(arr,target,0);
//        System.out.println(list);
        System.out.println(findAll_elem_Array_list(arr,target,0,new ArrayList<>()));
        System.out.println(findAllIndex_Array_list(arr,target,0));

    }

//*******************************************************************************
    static boolean find(int[] arr, int target, int index)
    {
        if (index == arr.length)
        {
            return false;
        }
        return  arr[index] == target || find(arr,target,index+1);
    }
//*******************************************************************************
    private static int linaer_search_func(int[] arr, int target, int index) {

        if (index == arr.length)
        {
            return -1;
        }
        if (arr[index] == target) {
            System.out.println("Index No. is : " + index + " having " + arr[index] + " founded");
            return index;

        }else {
            return linaer_search_func(arr, target, index + 1);
        }

    }

//********************************************************************************
    private static int linaer_search_func_last(int[] arr, int target, int index) {

        if (index == -1)
        {
            return -1;
        }
        if (arr[index] == target) {
            System.out.println("Index No. is : " + index + " having " + arr[index] + " founded");
            return index;

        }else {
            return linaer_search_func_last(arr, target, index - 1);
        }

    }

    static ArrayList<Integer> list = new ArrayList<>();
    static void findAllIndex(int[] arr,int target,int index){
        if (index == arr.length){
            return;
        }
        if (arr[index]== target){
            list.add(index);
        }
        findAllIndex(arr,target,index+1);
    }

//    ********************************************************************
    static ArrayList findAll_elem_Array_list(int[] arr, int target, int index,ArrayList<Integer> list)
    {
        if (arr.length == index)
        {
            return list;
        }
        if (arr[index] == target)
        {
            list.add(index);
        }
        return findAll_elem_Array_list(arr,target,index+1, list);
    }

    static  ArrayList<Integer> findAllIndex_Array_list(int[] arr, int target, int index)
    {
        ArrayList<Integer> list = new ArrayList<>();
        if (index == arr.length)
        {
            return list;
        }
//        this will  contain answer for that function call only
        if (arr[index]  == target)
        {
            list.add(index);
        }
        ArrayList<Integer> ansFromBelowCalls = findAllIndex_Array_list(arr, target, index+1);
        list.addAll(ansFromBelowCalls);
        return list;


    }

}
