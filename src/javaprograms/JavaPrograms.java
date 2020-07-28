/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaprograms;
import java.util.Scanner;
/**
 * <h1> Write a code for BinarySearch </h1>
 * <p>Simply display a element is found or not</p>
 * @author Divya
 * @version 1.0
 * @since   2020-07-28
 */
public class JavaPrograms {
    /**
     * 
     * @param arr list of elements
     * @param left is a pointer . Pointing to first element of array list.
     * @param right is a pointer . Pointing to last element of array list
     * @param element is a input element to search in array list
     * @return is -1 if element is not found
     */
        public int binarysearch(int arr[], int left, int right, int element){
            int mid;
            /**
             * calculate mid index based on left and right pointer
             */
            if(right>= left){
               mid= left+(right - left)/2; 
           /**
            *  If element is present in mid index then return mid 
            */
            if (arr[mid] == element){
                return mid;
            }
            /**
             * If element is less then mid pointer then search element from left to mid-1 part of array list
             */
            if(arr[mid] > element){
                return binarysearch(arr,left,mid-1,element);
            }
            /**
             * If element is greater then mid pointer then search element from mid+1 to right part of array list
             */
            return binarysearch(arr,mid+1,right,element);
        }
            /**
             * If element is not found then return -1
             */
            return -1;
                
}

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        JavaPrograms object = new JavaPrograms();
        Scanner sc= new Scanner(System.in);
        int elementsearch ;
        /**
         * @param n is size of array list
         */
        System.out.println("*********************** Enter Array Size ******************************\n");
        int n= sc.nextInt();
        // asign size to array list
        int arr[] = new int[n];
        /**
         * add values to array list
         */
        System.out.println("*********************** Enter Array Value ******************************\n");
        for(int i=0;i<n;i++){
        arr[i] = sc.nextInt();
        System.out.println("\n");
        }
        /**
         * @param elementsearch is value to search from array list
         */
        System.out.println("*********************** Enter Element to Search in Array List ******************************\n");
        elementsearch =sc.nextInt();
        
        /**
         * @param result is variable which get return value from function
         */
        int result = object.binarysearch(arr,0,n-1,elementsearch);
        // Compare value with result parameter and print output.
        if(result == -1){
        System.out.println("Element is not found");
        }
        else{
         System.out.println("Element is found");
        }
    }
    
}
