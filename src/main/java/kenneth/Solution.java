package kenneth;

/**
 * Main class for defining the required function(s).
 */
public class Solution {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }

    public int smallestEvenMultiple(int n) {
        // Given a positive integer n, return the smallest positive integer that is a multiple of both 2 and n.
        // 1 <= n <= 150


        if (n % 2 != 0) {
            // if n is odd number
            return n * 2;
        } else {
            return n;
        }


    }
}
