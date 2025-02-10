package arrays;

// find the array is sorted or not
public class Sorted {

    public static void main(String[] args) {
        int [] arr={1,2,5,7,10};
        System.out.println(sorted(arr,0));

    }

    //check array is sorted or not
    static boolean sorted(int [] arr, int index){

        // array is sorted this condition get execute
        if(index==arr.length-1){
            return true;
        }

        // check array of i is less than i+1
        boolean ans = arr[index] < arr[index+1];
        return ans && sorted(arr,index+1);
    }
}
