package arrays;

//search target using binary search
// used recursion to solve this problem
public class RBinarySearch {

    public static void main(String[] args) {
       int arr[]= {5,6,7,8,9,1,2,3};
        System.out.println(search(arr,2,0,arr.length-1));
    }

    static int search(int [] arr, int target, int s, int e) {

        // start is greater than end then element is not present
        if (s > e) {
            return -1;
        }
        int mid = s + (e - s) / 2;

        if (arr[mid] == target) {
            return mid;
        }

        // target is less than mid element
        if (arr[s] <= arr[mid]) {
            if (target >= arr[s] && target <= arr[mid]) {
                return search(arr, target, s, mid - 1);
            } else {
                return search(arr, target, mid + 1, e);
            }
        }
        if (target > arr[mid] && target < arr[e]) {
            return search(arr, target, mid + 1, e);
        }
        return search(arr, target, s, mid - 1);
        }

}
