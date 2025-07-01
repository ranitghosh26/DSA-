// package Array;
// Q 03
// Maximum Subarray Sum using Kadane's Algorithm
// LeetCode: https://leetcode.com/problems/maximum-subarray/

public class maxSubArraySum {

    public static int MaxSubArraySum(int arr[]){
        int maxSum= Integer.MIN_VALUE;
        int currentSum = 0;

        for(int i=0; i<arr.length;i++){
            currentSum+= arr[i];
            if(currentSum > maxSum){
                maxSum = currentSum;
            }
            if(currentSum<0){
                currentSum=0;
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println("Maximum Subarray Sum: " + MaxSubArraySum(arr));
    }
    
}
