package arrays;

import java.util.ArrayList;

public class FindElement {
    public static void main(String[] args) {
        int [] arr={2,4,6,7,11,15,4,17};
     //   System.out.println(find(arr,21,0));

        //find all element
        System.out.println("return all element Index present in the array \n");
        ArrayList ans= findAllIndex(arr,4,0,new ArrayList<>());
        System.out.println(ans);


    }

    // check the number is present in the array or not
    // if element is present return the index of element
    // otherwise  return -1
    static int find(int [] arr, int target, int index){
        if(index > arr.length-1){
            return -1;
        }

        if(arr[index]==target){
            return index;
        }
        return find(arr,target,index+1);
    }

    static ArrayList<Integer> findAllIndex(int [] arr,int target, int index, ArrayList<Integer> list ){

        if(index == arr.length){
            return list;
        }

        if(arr[index]==target){
            list.add(index);
        }
        return findAllIndex(arr,target,index+1,list);

    }
}
