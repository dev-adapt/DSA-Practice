package ARRAYS;

public class array12 {
    // Returns minimum number of platforms required
  static int findPlatform(int arr[], int dep[],
                                   int n)
    {
 
        // plat_needed indicates number of platforms
        // needed at a time
        int plat_needed = 1, result = 1;
 
        // run a nested  loop to find overlap
        for (int i = 0; i < n; i++) {
            // minimum platform
            plat_needed = 1;
 
            for (int j = 0; j < n; j++) {
                if (i != j)
                    // check for overlap
                    if (arr[i] >= arr[j]
                        && dep[j] >= arr[i])
                        plat_needed++;
            }
 
            // update result
            result = Math.max(result, plat_needed);
        }
 
        return result;
    }
 
    // Driver Code
    public static void main(String[] args)
    {
       int arr[] = {900, 940, 950, 1100, 1500, 1800};
       int dep[] = {910, 1200, 1120, 1130, 1900, 2000};
        int n = 6;
        System.out.println(findPlatform(arr, dep, n));
    }
}