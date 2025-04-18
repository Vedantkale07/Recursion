package arrays;

public class RLinearSearch{

    public static void main(String[] args) {
        int [] arr= {3,2,5,1,6,11};
        System.out.println(findIndex(arr,11,0));
    }

    static int findIndex(int [] arr, int target, int index){
        if(index== arr.length){
            return -1;
        }
        if (arr[index]== target){
            return index;
        }else{
            return findIndex(arr,target,index+1);
        }
    }
}
