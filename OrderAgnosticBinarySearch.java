package com.DSA.BinarySearch;


// THis is not just binary search in array given in ascending order ,you can check the elements given in descending order.




import java.util.Scanner;
public class OrderAgnosticBinarySearch {
    public static void main(String[] args){
        int[] arr={1,2,3,4,5,6,7,8,9,10};  //elements given in ascending order.
        int target=9;
        int result=binarySearch(arr,target);
        System.out.println(result);
        int[] arr1={11,9,8,6,4,3,2,0,-1};    //elements given in descending order.
        int target1=9;
        int result1=binarySearch(arr1,target1);
        System.out.println(result1);
        int[] arr2={9,9,9,9,9,9};    //All elements are same.
        int target2=9;
        int result2=binarySearch(arr2,target2);
        System.out.println(result2);
    }

    static int binarySearch(int[] arr,int target){
        int start=0, end=arr.length-1;
        while(start<=end)
        {
            int mid=(start+end)/2;
            if(arr[start]<arr[end]) {           // it will check for the array given is in ascending order only na??
                if (arr[mid] == target) return mid;
                else if (arr[mid] > target) end = mid - 1;
                else start = mid + 1;
            }
            else if(arr[start]>arr[end]){       // it will check for the array given in descending order only na??
                if (arr[mid] == target) return mid;
                else if (arr[mid] < target) end = mid - 1;
                else start = mid + 1;
            }
            else return 0;                    // it will happen when all the elements in the array will be same.
                                                //Hurray!!! no need to check and go for log(n) process.just print any element, because all are same only.
                                                //i am printing the first index
        }
        return -1;
    }

}
