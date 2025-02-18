package sorting;

import java.util.Arrays;

// for merge sort we used recursion
//
public class MergeSorting {
    public static void main(String[] args) {

        int [] arr={2,4,6,1,5,3};
        System.out.println(Arrays.toString(mergeSort(arr)));

    }

    static int [] mergeSort(int arr[]){
        if(arr.length ==1){
            return arr;
        }

        int mid = arr.length/2;

        int [] left= mergeSort(Arrays.copyOfRange(arr,0,mid));
        int [] right= mergeSort(Arrays.copyOfRange(arr,mid,arr.length));

      return   merge(left, right);
    }

    private static int [] merge(int [] first ,int [] second ) {
        int [] mix= new int[ first.length + second.length];

        int i=0;
        int j=0;
        int k=0;

       while(i< first.length && j< second.length){
           if(first[i] < second[j]){
               mix[k]=first[i];
               i++;
           }else{
               mix[k]=second[j];
               j++;
           }
           k++;
       }

       //it may be possible one of the attay is not complete
        //copy the remaing element
        while(i<first.length){
            mix[k]=first[i];
            i++;
            k++;
        }
        while(j<second.length){
            mix[k]=second[j];
            j++;
            k++;
        }
        return mix;

    }

}
