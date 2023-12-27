// Class definition for ThreeSum
public class ThreeSum {

    // Private constructor to prevent instantiation of the class
    private ThreeSum() { }

    // Method to print all triplets with sum zero in the array
    public static void printAll(int[] a) {
        // Get the length of the array
        int n = a.length;
        
        // Iterate through all possible combinations of i, j, and k
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    // If the sum of elements at positions i, j, and k is zero, print the triplet
                    if (a[i] + a[j] + a[k] == 0) {
                        StdOut.println(a[i] + " " + a[j] + " " + a[k]);
                    }
                }
            }
        }
    } 

    // Method to count the number of triplets with sum zero in the array
    public static int count(int[] a) {
        // Get the length of the array
        int n = a.length;
        // Initialize a counter for the number of triplets
        int count = 0;
        
        // Iterate through all possible combinations of i, j, and k
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    // If the sum of elements at positions i, j, and k is zero, increment the counter
                    if (a[i] + a[j] + a[k] == 0) {
                        count++;
                    }
                }
            }
        }
        
        // Return the final count
        return count;
    } 

    // Main method to execute the program
    public static void main(String[] args)  { 
        // Read integers from a file specified in the command line arguments
        In in = new In(args[0]);
        int[] a = in.readAllInts();

        // Start a stopwatch to measure the elapsed time
        Stopwatch timer = new Stopwatch();
        
        // Count the number of triplets satisfying the condition
        int count = count(a);
        
        // Print the elapsed time and the count of triplets
        StdOut.println("elapsed time = " + timer.elapsedTime());
        StdOut.println(count);
    } 
} 
