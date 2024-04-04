package ARRAYS;
import java.util.ArrayList;
public class array11 {
    static void printingArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    static void alternatingArray(int arr[]) {
        ArrayList<Integer> listPositive = new ArrayList<>();
        ArrayList<Integer> listNegative = new ArrayList<>();
        for (int i = 0; i < arr.length; i++){
            if(arr[i]>0){
                listPositive.add(arr[i]);
            }else{
                listNegative.add(arr[i]);
            }
        }
        int pos=0,neg=0,index=0;
        while(pos<listPositive.size()&& neg<listNegative.size()){
            arr[index++]=listNegative.get(neg++);
            arr[index++]=listPositive.get(pos++);
        }
        while(pos<listPositive.size()){
            arr[index++]=listPositive.get(pos++);
        }
        while(pos<listNegative.size()){
            arr[index++]=listNegative.get(neg++);
        }
        printingArray(arr);
    }

    /*
     * Given an array of positive and negative numbers, arrange them in an alternate
     * fashion such that
     * every positive number is followed by a negative and vice-versa maintaining
     * the order of appearance.
     * The number of positive and negative numbers need not be equal. Begin with a
     * negative number.
     * If there are more positive numbers, they appear at the end of the array. If
     * there are more negative
     * numbers, they too appear at the end of the array.
     */
    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, -8, -7, -2, 9, -1, 2, 3, -4, 5, 65, 43, -23 };
        System.out.println("printing the original array");
        printingArray(arr);
        System.out.println("printing the alternating array");
        alternatingArray(arr);
    }
}
