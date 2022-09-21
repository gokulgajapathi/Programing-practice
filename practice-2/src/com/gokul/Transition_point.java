package com.gokul;
import java.util.Scanner;

// GeekForGeek Question Link: https://practice.geeksforgeeks.org/problems/find-transition-point-1587115620/0

class Transition_point {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of elements:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter " + i + "th position element:");
            arr[i] = sc.nextInt();

            }
        System.out.println(transitionPoint(arr,n));
    }

     public static int transitionPoint(int[] arr, int n) {
        if (arr[n - 1] == 0) {
            return  -1;
        }
        if(arr[0] == 1){
            return 0;
        }
        int start = 0;
        int end = n-1;


        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] == 1 && arr[mid-1] == 0){
                return  mid;
            }
            else if(arr[mid] == 0){
                start = mid+1;
            }
            else if (arr[mid] == 1){
                start = mid-1;
            }
        }

        return 0;
    }


}

