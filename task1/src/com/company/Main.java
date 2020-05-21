package com.company;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] arr = new int [10];
        int min = 0;
        int max = 0;
        int sum = 0;
        float mid = 0;

        for (int i = 0; i < arr.length; i++){
            arr[i] = (int)(Math.random() * 10);
            if(arr[i]< min){
                min = arr[i];
            }
            if(arr[i] > max){
                max = arr[i];
            }
            sum += arr[i];
            mid = sum/10;
        }

        System.out.println(Arrays.toString(arr));
        System.out.println("Min : " + min);
        System.out.println("Max : " + max);
        System.out.println("Average : " + mid);

        /*task2*/
        int[] arr1 = new int[10];
        for(int i = 0;i < arr.length; i++){
            arr1[i] = (int)Math.round((Math.random() * 20) - 15);
        }
        System.out.println(Arrays.toString(arr1));
        int[] positives = Arrays.stream(arr1).filter(x -> x >= 0).toArray();
        int sum2=0;
        System.out.println("Here is the positive array elements");

        System.out.println(Arrays.toString(positives));
        System.out.println("Sum counting....");
        for(int j = 0 ; j< positives.length; j++){
            if(positives[j]%2==0){
                sum2+=positives[j];

            }
        }
        if(sum2 <=0){
            System.out.println("There are no even numbers in array");
        }else {
            System.out.println("Sum2 : " + sum2);
        }

}
}
