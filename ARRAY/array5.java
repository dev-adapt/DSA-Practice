package ARRAYS;
import java.util.*;
public class array5{

   //main method
   public static void main(String[] args){
   
      //Declare and initialize the first array elements
      Integer arr1[] = {12, 13, 5, 16, 9, 19};
      
      //Declare and initialize the second array elements
      Integer arr2[] = {16, 2, 60, 9, 8, 5, 9};
      
      //Initialize Hashset to perform union operation
      HashSet<Integer> set = new HashSet<>();
      
      //add first array to set
      set.addAll(Arrays.asList(arr1));
      
      //add second array to set
      set.addAll(Arrays.asList(arr2));
      
      //convert to array from set
      Integer[] union = {};
      union = set.toArray(union);
      
      //print the result
      System.out.println("Union of two arrays is: " + Arrays.toString(union));
    }
   }
