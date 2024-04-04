//package java_DSA_practise;

public class selectionSortProb {
    static void lexicographical(String[]fruits){
        int n=fruits.length;
        for(int i=0;i<n-1;i++){
            int curr=i;
            for(int j=i+1;j<n;j++){
                if(fruits[j].charAt(0)<fruits[curr].charAt(0))curr=j;
            } 
            String temp=fruits[i];
                fruits[i]=fruits[curr];
                fruits[curr]=temp;
        }
    }
    public static void main(String args[]){
        String []fruits={"papaya","watermelon","kiwi","mangoes","apples"};
        lexicographical(fruits);
       
        for(String val:fruits){
         System.out.print("'"+val+"'"+",");
        }
    }
}
